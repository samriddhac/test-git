package demo.order.v1.composite.order.collect.v33.delegator;

import com.abcd.uop.model.Order;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.order.collect.v33.IOrderCollectV33CompositeService;
import demo.order.v1.composite.order.collect.v33.helper.IOrderCollectV33CompositeServiceHelper;
import demo.order.v1.composite.order.collect.v33.helper.IShipmentV4CoreServiceHelper;
import java.lang.Override;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderCollectV33CompositeServiceDelegator
    implements IOrderCollectV33CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IOrderCollectV33CompositeServiceHelper orderCollectV33CompositeServiceHelper;

  private final IShipmentV4CoreServiceHelper shipmentV4CoreServiceHelper;

  @Override
  public Order collectOrder(Order body) {
    orderCollectV33CompositeServiceHelper.processCollectOrderRequest();
    if (isServiceCallEnabled("6bd44e49-51b1-44b6-bd11-484db148105e")) {
      shipmentV4CoreServiceHelper.createShipment("6bd44e49-51b1-44b6-bd11-484db148105e");
    }
    return orderCollectV33CompositeServiceHelper.processCollectOrderResponse();
  }

  @Override
  public com.abcd.oop.model.Order updateOrder(com.abcd.oop.model.Order body) {
    orderCollectV33CompositeServiceHelper.processUpdateOrderRequest();
    if (isServiceCallEnabled("f612fbaf-f3d5-41d6-8a66-3dd7183ea1b1")) {
      shipmentV4CoreServiceHelper.updateShipment("f612fbaf-f3d5-41d6-8a66-3dd7183ea1b1");
    }
    return orderCollectV33CompositeServiceHelper.processUpdateOrderResponse();
  }
}
