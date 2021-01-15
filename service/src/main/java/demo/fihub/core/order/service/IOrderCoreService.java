package demo.fihub.core.order.service;

import java.util.*;
import demo.fihub.core.order.model.*;

public interface IOrderCoreService {

  List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  List<OrderTransactions> getReturnsByOrderId(String orderId);

  Order publishReturnProcessEvent(Order Order);

  Order getReturnByOrderId(String OrderId);
}
