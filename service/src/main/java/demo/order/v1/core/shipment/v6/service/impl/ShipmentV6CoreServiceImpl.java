package demo.order.v1.core.shipment.v6.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.shipment.v6.dao.ShipmentV6CoreDao;
import com.abcd.uop.model.BadOrder;
import demo.order.v1.core.shipment.v6.service.ShipmentV6CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShipmentV6CoreServiceImpl implements ShipmentV6CoreService {

  private final ShipmentV6CoreDao shipmentV6CoreDao;

  @Override
  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return shipmentV6CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return shipmentV6CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return shipmentV6CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return shipmentV6CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return shipmentV6CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return shipmentV6CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
