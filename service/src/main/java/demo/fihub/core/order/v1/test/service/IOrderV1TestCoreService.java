package demo.fihub.core.order.v1.test.service;

import java.util.*;
import demo.fihub.core.order.v1.test.model.*;

public interface IOrderV1TestCoreService {

  List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  List<Order> getReturnsByCustomerBalOrderId(String customerOrderId);

  List<OrderTransactions> getReturnsByOrderId(String orderId);

  Order publishReturnProcessEvent(Order Order);

  Order getReturnByOrderId(String OrderId);
}
