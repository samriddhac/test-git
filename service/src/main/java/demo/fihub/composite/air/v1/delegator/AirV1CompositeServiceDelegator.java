package demo.fihub.composite.air.v1.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.air.v1.IAirV1CompositeService;
import demo.fihub.composite.air.v1.helper.IAV1CoreServiceHelper;
import demo.fihub.composite.air.v1.helper.IAirV1CompositeServiceHelper;
import demo.fihub.composite.air.v1.model.Aircraft;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AirV1CompositeServiceDelegator
    implements IAirV1CompositeService, ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAirV1CompositeServiceHelper airV1CompositeServiceHelper;

  private final IAV1CoreServiceHelper aV1CoreServiceHelper;

  @Override
  public List<Aircraft> getAircrafts() {
    airV1CompositeServiceHelper.processGetAircraftsRequest();
    if (isServiceCallEnabled("a-v1-0")) {
      aV1CoreServiceHelper.getReturnsByCustomerOrderId("a-v1-0");
    }
    return airV1CompositeServiceHelper.processGetAircraftsResponse();
  }

  @Override
  public void postAircrafts(Aircraft body) {
    airV1CompositeServiceHelper.processPostAircraftsRequest();
    if (isServiceCallEnabled("a-v1-1")) {
      aV1CoreServiceHelper.publishReturnProcessEvent("a-v1-1");
    }
    airV1CompositeServiceHelper.processPostAircraftsResponse();
  }

  @Override
  public Aircraft getAircraft(long aircraftId) {
    airV1CompositeServiceHelper.processGetAircraftRequest();
    return airV1CompositeServiceHelper.processGetAircraftResponse();
  }

  @Override
  public void putAircraft(long aircraftId, Aircraft body) {
    airV1CompositeServiceHelper.processPutAircraftRequest();
    airV1CompositeServiceHelper.processPutAircraftResponse();
  }

  @Override
  public void deleteAircraft(long aircraftId) {
    airV1CompositeServiceHelper.processDeleteAircraftRequest();
    airV1CompositeServiceHelper.processDeleteAircraftResponse();
  }
}
