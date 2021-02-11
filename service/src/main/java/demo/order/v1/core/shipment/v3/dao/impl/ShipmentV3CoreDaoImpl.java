package demo.order.v1.core.shipment.v3.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.order.v1.core.shipment.v3.dao.ShipmentV3CoreDao;
import demo.order.v1.core.shipment.v3.dao.mapper.*;
import demo.order.v1.core.shipment.v3.dao.mapper.*;
import demo.order.v1.core.shipment.v3.dao.mapper.*;

import com.abcd.uop.model.BadOrder;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ShipmentV3CoreDaoImpl implements ShipmentV3CoreDao {

  private final OrderToOrderMapper orderToOrderMapper;
  private final ReturnOrderToReturnOrderMapper returnOrderToReturnOrderMapper;
  private final BadOrderToBadOrderMapper badOrderToBadOrderMapper;
  private final SpannerTemplate spannerTemplate;

  @Override
  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest) {
    // TODO: your code goes here...
    Long id = System.nanoTime();
    spannerTemplate.insert(orderToOrderMapper.convertToEntity(shipmentRequest));
    return null;
  }

  @Override
  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(ponumber).build();
    demo.order.v1.core.shipment.v3.dao.entity.OrderMaster orderMasterEntity =
        spannerTemplate.read(demo.order.v1.core.shipment.v3.dao.entity.OrderMaster.class, key);
    ReturnOrder returnOrder = null;
    if (orderMasterEntity != null) {
      returnOrder = returnOrderToReturnOrderMapper.convertToResource(orderMasterEntity);
    }
    return returnOrder;
  }

  @Override
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(shipmentref).build();
    demo.order.v1.core.shipment.v3.dao.entity.OrderMaster orderMasterEntity =
        spannerTemplate.read(demo.order.v1.core.shipment.v3.dao.entity.OrderMaster.class, key);
    Order order = null;
    if (orderMasterEntity != null) {
      order = orderToOrderMapper.convertToResource(orderMasterEntity);
    }
    return order;
  }

  @Override
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(shipmentorderid).build();
    demo.order.v1.core.shipment.v3.dao.entity.OrderMaster orderMasterEntity =
        spannerTemplate.read(demo.order.v1.core.shipment.v3.dao.entity.OrderMaster.class, key);
    Order order = null;
    if (orderMasterEntity != null) {
      order = orderToOrderMapper.convertToResource(orderMasterEntity);
    }
    return order;
  }

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    spannerTemplate.update(orderToOrderMapper.convertToEntity(shipmentRequest));
    return null;
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    Key key = Key.newBuilder().append(shipmentid, shipmentorderid).build();
    demo.order.v1.core.shipment.v3.dao.entity.OrderMaster orderMasterEntity =
        spannerTemplate.read(demo.order.v1.core.shipment.v3.dao.entity.OrderMaster.class, key);
    BadOrder badOrder = null;
    if (orderMasterEntity != null) {
      badOrder = badOrderToBadOrderMapper.convertToResource(orderMasterEntity);
    }
    return badOrder;
  }
}
