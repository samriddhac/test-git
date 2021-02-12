package demo.order.v1.core.varf.v1.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.order.v1.core.varf.v1.dao.VarfV1CoreDao;
import demo.order.v1.core.varf.v1.dao.mapper.OrderToOrderMapper;

import com.abcd.uop.model.Order;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class VarfV1CoreDaoImpl implements VarfV1CoreDao {

  private final OrderToOrderMapper orderToOrderMapper;
  private final SpannerTemplate spannerTemplate;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // TODO: your code goes here...
    Long id = System.nanoTime();
    spannerTemplate.insert(orderToOrderMapper.convertToEntity(lineItemArray));
    return null;
  }
}
