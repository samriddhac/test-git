package demo.fihub.core.order.id.v7.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.order.id.v7.model.*;
import demo.fihub.core.order.id.v7.service.OrderIdV7CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderIdV7CoreServiceImpl implements OrderIdV7CoreService {

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
