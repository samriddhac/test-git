package demo.fihub.composite.air.v2.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.air.v2.IAirV2CompositeService;
import demo.fihub.composite.air.v2.helper.IAirV2CompositeServiceHelper;
import demo.fihub.composite.air.v2.helper.IOrderIdV7CoreServiceHelper;
import demo.fihub.composite.air.v2.model.Aircraft;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AirV2CompositeServiceDelegator
    implements IAirV2CompositeService, ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAirV2CompositeServiceHelper airV2CompositeServiceHelper;

  private final IOrderIdV7CoreServiceHelper orderIdV7CoreServiceHelper;

  @Override
  public List<Aircraft> getAircrafts() {
    airV2CompositeServiceHelper.processGetAircraftsRequest();
    if (isServiceCallEnabled("qqqq")) {
      orderIdV7CoreServiceHelper.getReturnsByCustomerOrderId("qqqq");
    }
    return airV2CompositeServiceHelper.processGetAircraftsResponse();
  }

  @Override
  public void postAircrafts(Aircraft body) {
    airV2CompositeServiceHelper.processPostAircraftsRequest();
    if (isServiceCallEnabled("wwwww")) {
      orderIdV7CoreServiceHelper.publishReturnProcessEvent("wwwww");
    }
    airV2CompositeServiceHelper.processPostAircraftsResponse();
  }

  @Override
  public Aircraft getAircraft(long aircraftId) {
    airV2CompositeServiceHelper.processGetAircraftRequest();
    return airV2CompositeServiceHelper.processGetAircraftResponse();
  }

  @Override
  public void putAircraft(long aircraftId, Aircraft body) {
    airV2CompositeServiceHelper.processPutAircraftRequest();
    airV2CompositeServiceHelper.processPutAircraftResponse();
  }

  @Override
  public void deleteAircraft(long aircraftId) {
    airV2CompositeServiceHelper.processDeleteAircraftRequest();
    airV2CompositeServiceHelper.processDeleteAircraftResponse();
  }
}
