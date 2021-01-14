package demo.fihub.core.order.id.v7.service;

import java.util.*;
import demo.fihub.core.order.id.v7.model.*;

public interface IOrderIdV7CoreService {

  List<Order> getReturnsByCustomerOrderId(String customerOrderId);

  List<OrderTransactions> getReturnsByOrderId(String orderId);

  Order publishReturnProcessEvent(Order Order);

  Order getReturnByOrderId(String OrderId);
}
