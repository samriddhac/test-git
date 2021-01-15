package demo.fihub.composite.order.collect.v2;

import java.util.List;
import demo.fihub.composite.order.collect.v2.model.*;

/** */
public interface IOrderCollectV2CompositeService {

  public List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  public List<OrderTransactions> getReturnsByOrderId(String orderId);

  public Order publishReturnProcessEvent(Order Order);

  public Order getReturnByOrderId(String OrderId);
}
