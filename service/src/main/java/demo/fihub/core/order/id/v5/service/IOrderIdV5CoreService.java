package demo.fihub.core.order.id.v5.service;

import java.util.*;
import demo.fihub.core.order.id.v5.model.*;

public interface IOrderIdV5CoreService {

  List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  List<OrderTransactions> getReturnsByOrderId(String orderId);

  Order publishReturnProcessEvent(Order Order);

  Order getReturnByOrderId(String OrderId);
}
