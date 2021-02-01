package demo.fihub.core.order.v1.test.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.fihub.core.order.v1.test.dao.OrderV1TestCoreDao;
import demo.fihub.core.order.v1.test.dao.mapper.*;
import demo.fihub.core.order.v1.test.dao.mapper.*;

import demo.fihub.core.order.v1.test.model.*;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OrderV1TestCoreDaoImpl implements OrderV1TestCoreDao {

  private final OrderToOrderMapper orderToOrderMapper;
  private final OrderTransactionsToOrderTransactionsMapper
      orderTransactionsToOrderTransactionsMapper;
  private final SpannerTemplate spannerTemplate;

  @Override
  public List<Order> getReturnsByCustomerOrderId(String customerOrderId) {
    // HINT: your code goes here...
    return spannerTemplate.readAll(demo.fihub.core.order.v1.test.dao.entity.OrderLine.class)
        .stream()
        .map(orderToOrderMapper::convertToResource)
        .collect(Collectors.toList());
  }

  @Override
  public List<OrderTransactions> getReturnsByOrderId(String orderId) {
    // HINT: your code goes here...
    return spannerTemplate.readAll(demo.fihub.core.order.v1.test.dao.entity.OrderLine.class)
        .stream()
        .map(orderTransactionsToOrderTransactionsMapper::convertToResource)
        .collect(Collectors.toList());
  }

  @Override
  public Order publishReturnProcessEvent(Order Order) {
    // TODO: your code goes here...
    Long id = System.nanoTime();
    spannerTemplate.insert(orderToOrderMapper.convertToEntity(Order));
    return Order;
  }

  @Override
  public Order getReturnByOrderId(String OrderId) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(OrderId).build();
    demo.fihub.core.order.v1.test.dao.entity.OrderLine orderLineEntity =
        spannerTemplate.read(demo.fihub.core.order.v1.test.dao.entity.OrderLine.class, key);
    Order order = null;
    if (orderLineEntity != null) {
      order = orderToOrderMapper.convertToResource(orderLineEntity);
    }
    return order;
  }
}
