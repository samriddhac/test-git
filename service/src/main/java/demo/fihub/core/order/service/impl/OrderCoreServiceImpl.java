package demo.fihub.core.order.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.order.model.*;
import demo.fihub.core.order.service.OrderCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderCoreServiceImpl implements OrderCoreService {

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    // TODO: your code goes here...
    return null;
  }
}
