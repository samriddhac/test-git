package demo.fihub.composite.order.collect.v1;

import java.util.List;
import demo.fihub.composite.order.collect.v1.model.*;

/** */
public interface IOrderCollectV1CompositeService {

  public List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  public List<OrderTransactions> getReturnsByOrderId(String orderId);

  public Order publishReturnProcessEvent(Order Order);

  public Order getReturnByOrderId(String OrderId);
}
