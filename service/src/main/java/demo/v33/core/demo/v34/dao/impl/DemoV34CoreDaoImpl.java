package demo.v33.core.demo.v34.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.v33.core.demo.v34.dao.DemoV34CoreDao;
import demo.v33.core.demo.v34.dao.mapper.*;

import demo.v33.core.demo.v34.model.*;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class DemoV34CoreDaoImpl implements DemoV34CoreDao {

  private final OrderToOrderMapper orderToOrderMapper;
  private final SpannerTemplate spannerTemplate;

  @Override
  public Order createShipment(Order shipmentRequest) {
    // TODO: your code goes here...
    Long id = System.nanoTime();
    spannerTemplate.insert(orderToOrderMapper.convertToEntity(shipmentRequest));
    return shipmentRequest;
  }

  @Override
  public Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(ponumber).build();
    demo.v33.core.demo.v34.dao.entity.Object objectEntity =
        spannerTemplate.read(demo.v33.core.demo.v34.dao.entity.Object.class, key);
    Order order = null;
    if (objectEntity != null) {
      order = orderToOrderMapper.convertToResource(objectEntity);
    }
    return order;
  }

  @Override
  public Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(shipmentref).build();
    demo.v33.core.demo.v34.dao.entity.Object objectEntity =
        spannerTemplate.read(demo.v33.core.demo.v34.dao.entity.Object.class, key);
    Order order = null;
    if (objectEntity != null) {
      order = orderToOrderMapper.convertToResource(objectEntity);
    }
    return order;
  }

  @Override
  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(shipmentorderid).build();
    demo.v33.core.demo.v34.dao.entity.Object objectEntity =
        spannerTemplate.read(demo.v33.core.demo.v34.dao.entity.Object.class, key);
    Order order = null;
    if (objectEntity != null) {
      order = orderToOrderMapper.convertToResource(objectEntity);
    }
    return order;
  }

  public Order updateShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    spannerTemplate.update(orderToOrderMapper.convertToEntity(shipmentRequest));
    return shipmentRequest;
  }

  @Override
  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(shipmentid, shipmentorderid).build();
    demo.v33.core.demo.v34.dao.entity.Object objectEntity =
        spannerTemplate.read(demo.v33.core.demo.v34.dao.entity.Object.class, key);
    Order order = null;
    if (objectEntity != null) {
      order = orderToOrderMapper.convertToResource(objectEntity);
    }
    return order;
  }
}
