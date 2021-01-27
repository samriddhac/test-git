package demo.fihub.composite.air.v4.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.air.v4.IAirV4CompositeService;
import demo.fihub.composite.air.v4.helper.IAirV4CompositeServiceHelper;
import demo.fihub.composite.air.v4.helper.IOrderIdV6CoreServiceHelper;
import demo.fihub.composite.air.v4.helper.IOrderIdV7CoreServiceHelper;
import demo.fihub.composite.air.v4.model.Aircraft;
import java.lang.Override;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AirV4CompositeServiceDelegator
    implements IAirV4CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAirV4CompositeServiceHelper airV4CompositeServiceHelper;

  private final IOrderIdV7CoreServiceHelper orderIdV7CoreServiceHelper;

  private final IOrderIdV6CoreServiceHelper orderIdV6CoreServiceHelper;

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
    List<Supplier<?>> _1 = new ArrayList<Supplier<?>>();
    if (isServiceCallEnabled("bbbbb")) {
      _1.add(() -> orderIdV7CoreServiceHelper.publishReturnProcessEvent("bbbbb"));
    }
    if (isServiceCallEnabled("eeeeeee")) {
      _1.add(() -> orderIdV6CoreServiceHelper.getReturnsByCustomerOrderId("eeeeeee"));
    }
    if (!_1.isEmpty()) {
      futureUtils.asyncExecute(_1);
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
