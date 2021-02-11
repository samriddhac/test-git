package demo.order.v1.core.shipment.v4.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.shipment.v4.dao.ShipmentV4CoreDao;
import com.abcd.uop.model.BadOrder;
import demo.order.v1.core.shipment.v4.service.ShipmentV4CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShipmentV4CoreServiceImpl implements ShipmentV4CoreService {

  private final ShipmentV4CoreDao shipmentV4CoreDao;

  @Override
  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return shipmentV4CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return shipmentV4CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return shipmentV4CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return shipmentV4CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return shipmentV4CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return shipmentV4CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
