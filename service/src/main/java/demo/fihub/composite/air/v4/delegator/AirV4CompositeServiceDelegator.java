package demo.fihub.composite.air.v4.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.air.v4.IAirV4CompositeService;
import demo.fihub.composite.air.v4.helper.IAirV4CompositeServiceHelper;
import demo.fihub.composite.air.v4.helper.IOrderIdV7CoreServiceHelper;
import demo.fihub.composite.air.v4.model.Aircraft;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AirV4CompositeServiceDelegator
    implements IAirV4CompositeService, ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAirV4CompositeServiceHelper airV4CompositeServiceHelper;

  private final IOrderIdV7CoreServiceHelper orderIdV7CoreServiceHelper;

  @Override
  public List<Aircraft> getAircrafts() {
    airV4CompositeServiceHelper.processGetAircraftsRequest();
    if (isServiceCallEnabled("aaaaa")) {
      orderIdV7CoreServiceHelper.getReturnsByOrderId("aaaaa");
    }
    return airV4CompositeServiceHelper.processGetAircraftsResponse();
  }

  @Override
  public void postAircrafts(Aircraft body) {
    airV4CompositeServiceHelper.processPostAircraftsRequest();
    if (isServiceCallEnabled("bbbbb")) {
      orderIdV7CoreServiceHelper.publishReturnProcessEvent("bbbbb");
    }
    airV4CompositeServiceHelper.processPostAircraftsResponse();
  }

  @Override
  public Aircraft getAircraft(long aircraftId) {
    airV4CompositeServiceHelper.processGetAircraftRequest();
    return airV4CompositeServiceHelper.processGetAircraftResponse();
  }

  @Override
  public void putAircraft(long aircraftId, Aircraft body) {
    airV4CompositeServiceHelper.processPutAircraftRequest();
    if (isServiceCallEnabled("cccccc")) {
      orderIdV7CoreServiceHelper.publishReturnProcessEvent("cccccc");
    }
    airV4CompositeServiceHelper.processPutAircraftResponse();
  }

  @Override
  public void deleteAircraft(long aircraftId) {
    airV4CompositeServiceHelper.processDeleteAircraftRequest();
    airV4CompositeServiceHelper.processDeleteAircraftResponse();
  }
}
