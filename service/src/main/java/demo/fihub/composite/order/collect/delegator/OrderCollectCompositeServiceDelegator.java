package demo.fihub.composite.order.collect.delegator;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.future.FutureUtils;
import demo.fihub.composite.order.collect.IOrderCollectCompositeService;
import demo.fihub.composite.order.collect.IOrderCollectCompositeServiceStream;
import demo.fihub.composite.order.collect.helper.IOrderCollectCompositeServiceHelper;
import demo.fihub.composite.order.collect.helper.IOrderCompositeServiceHelper;
import demo.fihub.composite.order.collect.model.Order;
import demo.fihub.composite.order.collect.model.OrderTransactions;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OrderCollectCompositeServiceDelegator
    implements IOrderCollectCompositeService,
        IOrderCollectCompositeServiceStream,
        ServiceExceutionContextUtil {
  private final FutureUtils futureUtils;

  private final IOrderCollectCompositeServiceHelper orderCollectCompositeServiceHelper;

  private final IOrderCompositeServiceHelper orderCompositeServiceHelper;

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    orderCollectCompositeServiceHelper.processGetReturnsByCustomerOrderIdRequest();
    if (isServiceCallEnabled("8c881c16-24e3-421c-a685-d218f4565a22")) {
      orderCompositeServiceHelper.getReturnsByCustomerOrderId(
          "8c881c16-24e3-421c-a685-d218f4565a22");
    }
    return orderCollectCompositeServiceHelper.processGetReturnsByCustomerOrderIdResponse();
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    orderCollectCompositeServiceHelper.processGetReturnsByOrderIdRequest();
    if (isServiceCallEnabled("jgjgjgjgjgjgjgjgjgjgjgjg")) {
      orderCompositeServiceHelper.getReturnsByOrderId("jgjgjgjgjgjgjgjgjgjgjgjg");
    }
    return orderCollectCompositeServiceHelper.processGetReturnsByOrderIdResponse();
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    orderCollectCompositeServiceHelper.processPublishReturnProcessEventRequest();
    return orderCollectCompositeServiceHelper.processPublishReturnProcessEventResponse();
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    orderCollectCompositeServiceHelper.processGetReturnByOrderIdRequest();
    return orderCollectCompositeServiceHelper.processGetReturnByOrderIdResponse();
  }
}
