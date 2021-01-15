package demo.fihub.composite.order.collect.v1.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.order.collect.v1.IOrderCollectV1CompositeService;
import demo.fihub.composite.order.collect.v1.IOrderCollectV1CompositeServiceStream;
import demo.fihub.composite.order.collect.v1.helper.IOrderCollectV1CompositeServiceHelper;
import demo.fihub.composite.order.collect.v1.helper.IOrderCoreServiceHelper;
import demo.fihub.composite.order.collect.v1.model.Order;
import demo.fihub.composite.order.collect.v1.model.OrderTransactions;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderCollectV1CompositeServiceDelegator
    implements IOrderCollectV1CompositeService,
        IOrderCollectV1CompositeServiceStream,
        ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IOrderCollectV1CompositeServiceHelper orderCollectV1CompositeServiceHelper;

  private final IOrderCoreServiceHelper orderCoreServiceHelper;

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    orderCollectV1CompositeServiceHelper.processGetReturnsByCustomerOrderIdRequest();
    if (isServiceCallEnabled("8c881c16-24e3-421c-a685-d218f4565a22")) {
      orderCompositeServiceHelper.getReturnsByCustomerOrderId(
          "8c881c16-24e3-421c-a685-d218f4565a22");
    }
    return orderCollectV1CompositeServiceHelper.processGetReturnsByCustomerOrderIdResponse();
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    orderCollectV1CompositeServiceHelper.processGetReturnsByOrderIdRequest();
    if (isServiceCallEnabled("jgjgjgjgjgjgjgjgjgjgjgjg")) {
      orderCompositeServiceHelper.getReturnsByOrderId("jgjgjgjgjgjgjgjgjgjgjgjg");
    }
    return orderCollectV1CompositeServiceHelper.processGetReturnsByOrderIdResponse();
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    orderCollectV1CompositeServiceHelper.processPublishReturnProcessEventRequest();
    return orderCollectV1CompositeServiceHelper.processPublishReturnProcessEventResponse();
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    orderCollectV1CompositeServiceHelper.processGetReturnByOrderIdRequest();
    return orderCollectV1CompositeServiceHelper.processGetReturnByOrderIdResponse();
  }
}
