package demo.order.v1.composite.blah.test.delegator;

import com.abcd.uop.model.Order;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.blah.test.IBlahTestCompositeService;
import demo.order.v1.composite.blah.test.helper.IAbcdeV1CompositeServiceHelper;
import demo.order.v1.composite.blah.test.helper.IBlahTestCompositeServiceHelper;
import java.lang.Override;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BlahTestCompositeServiceDelegator
    implements IBlahTestCompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IBlahTestCompositeServiceHelper blahTestCompositeServiceHelper;

  private final IAbcdeV1CompositeServiceHelper abcdeV1CompositeServiceHelper;

  @Override
  public Order collectOrder(Order body) {
    blahTestCompositeServiceHelper.processCollectOrderRequest();
    if (isServiceCallEnabled("ddc92429-5877-4e6c-bbd1-dd922a34cd8e")) {
      abcdeV1CompositeServiceHelper.getOrderIdForCustomerOrderIdOrReservationId(
          "ddc92429-5877-4e6c-bbd1-dd922a34cd8e");
    }
    return blahTestCompositeServiceHelper.processCollectOrderResponse();
  }
}
