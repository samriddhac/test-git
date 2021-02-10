package demo.v33.core.releasegroup.v1.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.v33.core.releasegroup.v1.dao.ReleasegroupV1CoreDao;
import demo.v33.core.releasegroup.v1.dao.mapper.*;

import com.abcd.uop.model.Order;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReleasegroupV1CoreDaoImpl implements ReleasegroupV1CoreDao {

  private final OrderArrayToOrderArrayMapper orderArrayToOrderArrayMapper;
  private final SpannerTemplate spannerTemplate;

  @Override
  public Object groupLogicalShipments(List<Order> lineItemArray) {
    // TODO: your code goes here...
    Long id = System.nanoTime();
    spannerTemplate.insert(orderArrayToOrderArrayMapper.convertToEntity(lineItemArray));
    return null;
  }
}
