package demo.order.v1.core.shipment.v6.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import demo.order.v1.core.shipment.v6.dao.ShipmentV6CoreDao;
import demo.order.v1.core.shipment.v6.dao.mapper.*;
import demo.order.v1.core.shipment.v6.dao.mapper.*;
import demo.order.v1.core.shipment.v6.dao.mapper.*;
import demo.order.v1.core.shipment.v6.dao.repository.*;
import com.abcd.uop.model.BadOrder;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ShipmentV6CoreDaoImpl implements ShipmentV6CoreDao {

  private final OrderMasterRepository orderMasterRepository;
  private final OrderToOrderMapper orderToOrderMapper;
  private final ReturnOrderToReturnOrderMapper returnOrderToReturnOrderMapper;
  private final BadOrderToBadOrderMapper badOrderToBadOrderMapper;

  @Override
  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return orderToOrderMapper.convertToResource(
        orderMasterRepository.save(orderToOrderMapper.convertToEntity(shipmentRequest)));
  }

  @Override
  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber) {

    // HINT: your code goes here...
    Optional<demo.order.v1.core.shipment.v6.dao.entity.OrderMaster> orderMasterEntity =
        orderMasterRepository.findById(ponumber);
    if (orderMasterEntity.isPresent()) {
      return returnOrderToReturnOrderMapper.convertToResource(orderMasterEntity.get());
    }
    return null;
  }

  @Override
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref) {

    // HINT: your code goes here...
    Optional<demo.order.v1.core.shipment.v6.dao.entity.OrderMaster> orderMasterEntity =
        orderMasterRepository.findById(shipmentref);
    if (orderMasterEntity.isPresent()) {
      return orderToOrderMapper.convertToResource(orderMasterEntity.get());
    }
    return null;
  }

  @Override
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid) {

    // HINT: your code goes here...
    Optional<demo.order.v1.core.shipment.v6.dao.entity.OrderMaster> orderMasterEntity =
        orderMasterRepository.findById(shipmentorderid);
    if (orderMasterEntity.isPresent()) {
      return orderToOrderMapper.convertToResource(orderMasterEntity.get());
    }
    return null;
  }

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return orderToOrderMapper.convertToResource(
        object.save(orderToOrderMapper.convertToEntity(shipmentRequest)));
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {

    // HINT: your code goes here...
    Optional<demo.order.v1.core.shipment.v6.dao.entity.OrderMaster> orderMasterEntity =
        orderMasterRepository.findById(shipmentid, shipmentorderid);
    if (orderMasterEntity.isPresent()) {
      return badOrderToBadOrderMapper.convertToResource(orderMasterEntity.get());
    }
    return null;
  }
}
