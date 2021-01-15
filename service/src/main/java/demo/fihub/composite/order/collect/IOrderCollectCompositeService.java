package demo.fihub.composite.order.collect;

import java.util.List;
import demo.fihub.composite.order.collect.model.*;

/** */
public interface IOrderCollectCompositeService {

  public List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  public List<OrderTransactions> getReturnsByOrderId(String orderId);

  public Order publishReturnProcessEvent(Order Order);

  public Order getReturnByOrderId(String OrderId);
}
