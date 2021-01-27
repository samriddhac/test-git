package demo.fihub.composite.air.v3.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.air.v3.IAirV3CompositeService;
import demo.fihub.composite.air.v3.helper.IAirV3CompositeServiceHelper;
import demo.fihub.composite.air.v3.helper.IOrderIdV7CoreServiceHelper;
import demo.fihub.composite.air.v3.model.Aircraft;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AirV3CompositeServiceDelegator
    implements IAirV3CompositeService, ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAirV3CompositeServiceHelper airV3CompositeServiceHelper;

  private final IOrderIdV7CoreServiceHelper orderIdV7CoreServiceHelper;

  @Override
  public List<Aircraft> getAircrafts() {
    airV3CompositeServiceHelper.processGetAircraftsRequest();
    if (isServiceCallEnabled("qqqq")) {
      orderIdV7CoreServiceHelper.getReturnsByCustomerOrderId("qqqq");
    }
    return airV3CompositeServiceHelper.processGetAircraftsResponse();
  }

  @Override
  public void postAircrafts(Aircraft body) {
    airV3CompositeServiceHelper.processPostAircraftsRequest();
    if (isServiceCallEnabled("wwwww")) {
      orderIdV7CoreServiceHelper.publishReturnProcessEvent("wwwww");
    }
    airV3CompositeServiceHelper.processPostAircraftsResponse();
  }

  @Override
  public Aircraft getAircraft(long aircraftId) {
    airV3CompositeServiceHelper.processGetAircraftRequest();
    return airV3CompositeServiceHelper.processGetAircraftResponse();
  }

  @Override
  public void putAircraft(long aircraftId, Aircraft body) {
    airV3CompositeServiceHelper.processPutAircraftRequest();
    if (isServiceCallEnabled("uuuuuuu")) {
      orderIdV7CoreServiceHelper.publishReturnProcessEvent("uuuuuuu");
    }
    airV3CompositeServiceHelper.processPutAircraftResponse();
  }

  @Override
  public void deleteAircraft(long aircraftId) {
    airV3CompositeServiceHelper.processDeleteAircraftRequest();
    airV3CompositeServiceHelper.processDeleteAircraftResponse();
  }
}
