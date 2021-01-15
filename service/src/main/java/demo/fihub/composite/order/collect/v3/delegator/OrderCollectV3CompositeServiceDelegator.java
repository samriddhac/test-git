package demo.fihub.composite.order.collect.v3.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.order.collect.v3.IOrderCollectV3CompositeService;
import demo.fihub.composite.order.collect.v3.IOrderCollectV3CompositeServiceStream;
import demo.fihub.composite.order.collect.v3.helper.IOrderCollectV3CompositeServiceHelper;
import demo.fihub.composite.order.collect.v3.helper.IOrderCoreServiceHelper;
import demo.fihub.composite.order.collect.v3.model.Order;
import demo.fihub.composite.order.collect.v3.model.OrderTransactions;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderCollectV3CompositeServiceDelegator
    implements IOrderCollectV3CompositeService,
        IOrderCollectV3CompositeServiceStream,
        ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IOrderCollectV3CompositeServiceHelper orderCollectV3CompositeServiceHelper;

  private final IOrderCoreServiceHelper orderCoreServiceHelper;

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    orderCollectV3CompositeServiceHelper.processGetReturnsByCustomerOrderIdRequest();
    if (isServiceCallEnabled("8c881c16-24e3-421c-a685-d218f4565a22")) {
      orderCoreServiceHelper.getReturnsByCustomerOrderId("8c881c16-24e3-421c-a685-d218f4565a22");
    }
    return orderCollectV3CompositeServiceHelper.processGetReturnsByCustomerOrderIdResponse();
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    orderCollectV3CompositeServiceHelper.processGetReturnsByOrderIdRequest();
    if (isServiceCallEnabled("jgjgjgjgjgjgjgjgjgjgjgjg")) {
      orderCoreServiceHelper.getReturnsByOrderId("jgjgjgjgjgjgjgjgjgjgjgjg");
    }
    return orderCollectV3CompositeServiceHelper.processGetReturnsByOrderIdResponse();
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    orderCollectV3CompositeServiceHelper.processPublishReturnProcessEventRequest();
    return orderCollectV3CompositeServiceHelper.processPublishReturnProcessEventResponse();
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    orderCollectV3CompositeServiceHelper.processGetReturnByOrderIdRequest();
    return orderCollectV3CompositeServiceHelper.processGetReturnByOrderIdResponse();
  }
}
