package demo.fihub.composite.order.collect.v2.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.order.collect.v2.IOrderCollectV2CompositeService;
import demo.fihub.composite.order.collect.v2.IOrderCollectV2CompositeServiceStream;
import demo.fihub.composite.order.collect.v2.helper.IOrderCollectV2CompositeServiceHelper;
import demo.fihub.composite.order.collect.v2.helper.IOrderCoreServiceHelper;
import demo.fihub.composite.order.collect.v2.model.Order;
import demo.fihub.composite.order.collect.v2.model.OrderTransactions;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderCollectV2CompositeServiceDelegator
    implements IOrderCollectV2CompositeService,
        IOrderCollectV2CompositeServiceStream,
        ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IOrderCollectV2CompositeServiceHelper orderCollectV2CompositeServiceHelper;

  private final IOrderCoreServiceHelper orderCoreServiceHelper;

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    orderCollectV2CompositeServiceHelper.processGetReturnsByCustomerOrderIdRequest();
    if (isServiceCallEnabled("8c881c16-24e3-421c-a685-d218f4565a22")) {
      orderCoreServiceHelper.getReturnsByCustomerOrderId("8c881c16-24e3-421c-a685-d218f4565a22");
    }
    return orderCollectV2CompositeServiceHelper.processGetReturnsByCustomerOrderIdResponse();
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    orderCollectV2CompositeServiceHelper.processGetReturnsByOrderIdRequest();
    if (isServiceCallEnabled("jgjgjgjgjgjgjgjgjgjgjgjg")) {
      orderCoreServiceHelper.getReturnsByOrderId("jgjgjgjgjgjgjgjgjgjgjgjg");
    }
    return orderCollectV2CompositeServiceHelper.processGetReturnsByOrderIdResponse();
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    orderCollectV2CompositeServiceHelper.processPublishReturnProcessEventRequest();
    return orderCollectV2CompositeServiceHelper.processPublishReturnProcessEventResponse();
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    orderCollectV2CompositeServiceHelper.processGetReturnByOrderIdRequest();
    return orderCollectV2CompositeServiceHelper.processGetReturnByOrderIdResponse();
  }
}
