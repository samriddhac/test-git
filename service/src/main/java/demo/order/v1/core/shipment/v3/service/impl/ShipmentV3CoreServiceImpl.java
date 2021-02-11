package demo.order.v1.core.shipment.v3.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.shipment.v3.dao.ShipmentV3CoreDao;
import com.abcd.uop.model.BadOrder;
import demo.order.v1.core.shipment.v3.service.ShipmentV3CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ShipmentV3CoreServiceImpl implements ShipmentV3CoreService {

  private final ShipmentV3CoreDao shipmentV3CoreDao;

  @Override
  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return shipmentV3CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return shipmentV3CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return shipmentV3CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return shipmentV3CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return shipmentV3CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return shipmentV3CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
