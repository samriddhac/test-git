package demo.order.v1.core.group.v1.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.order.v1.core.group.v1.dao.GroupV1CoreDao;
import demo.order.v1.core.group.v1.dao.mapper.*;

import com.abcd.uop.model.Order;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class GroupV1CoreDaoImpl implements GroupV1CoreDao {

  private final OrderArrayToOrderArrayMapper orderArrayToOrderArrayMapper;
  private final SpannerTemplate spannerTemplate;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // TODO: your code goes here...
    Long id = System.nanoTime();
    spannerTemplate.insert(orderArrayToOrderArrayMapper.convertToEntity(lineItemArray));
    return null;
  }
}
