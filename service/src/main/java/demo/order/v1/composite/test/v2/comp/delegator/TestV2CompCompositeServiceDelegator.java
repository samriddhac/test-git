package demo.order.v1.composite.test.v2.comp.delegator;

import com.abcd.uop.model.Order;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.test.v2.comp.ITestV2CompCompositeService;
import demo.order.v1.composite.test.v2.comp.helper.IAbcdeV1CompositeServiceHelper;
import demo.order.v1.composite.test.v2.comp.helper.ITestV2CompCompositeServiceHelper;
import java.lang.Override;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestV2CompCompositeServiceDelegator
    implements ITestV2CompCompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final ITestV2CompCompositeServiceHelper testV2CompCompositeServiceHelper;

  private final IAbcdeV1CompositeServiceHelper abcdeV1CompositeServiceHelper;

  @Override
  public Order collectOrder(Order body) {
    testV2CompCompositeServiceHelper.processCollectOrderRequest();
    if (isServiceCallEnabled("6f706809-efd9-4ac0-965f-c515682cecdd")) {
      abcdeV1CompositeServiceHelper.getOrderIdForCustomerOrderIdOrReservationId(
          "6f706809-efd9-4ac0-965f-c515682cecdd");
    }
    return testV2CompCompositeServiceHelper.processCollectOrderResponse();
  }

  @Override
  public com.abcd.oop.model.Order updateOrder(com.abcd.oop.model.Order body) {
    testV2CompCompositeServiceHelper.processUpdateOrderRequest();
    if (isServiceCallEnabled("10979ed2-f270-4b3b-9c1e-aface3b5ac14")) {
      abcdeV1CompositeServiceHelper.getOrderIdForCustomerOrderIdOrReservationId(
          "10979ed2-f270-4b3b-9c1e-aface3b5ac14");
    }
    return testV2CompCompositeServiceHelper.processUpdateOrderResponse();
  }
}
