package demo.fihub.core.order.id.v5.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.order.id.v5.model.*;
import demo.fihub.core.order.id.v5.service.OrderIdV5CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderIdV5CoreServiceImpl implements OrderIdV5CoreService {

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
