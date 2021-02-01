package demo.fihub.core.order.v1.test.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.order.v1.test.dao.OrderV1TestCoreDao;
import demo.fihub.core.order.v1.test.model.*;
import demo.fihub.core.order.v1.test.service.OrderV1TestCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderV1TestCoreServiceImpl implements OrderV1TestCoreService {

  private final OrderV1TestCoreDao orderV1TestCoreDao;

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    // HINT: your code goes here...
    return orderV1TestCoreDao.getReturnsByCustomerOrderId(customerOrderId);
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    // HINT: your code goes here...
    return orderV1TestCoreDao.getReturnsByOrderId(orderId);
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    // HINT: your code goes here...
    return orderV1TestCoreDao.publishReturnProcessEvent(Order);
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    // HINT: your code goes here...
    return orderV1TestCoreDao.getReturnByOrderId(OrderId);
  }
}
