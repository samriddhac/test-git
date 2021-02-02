package demo.v33.core.demo.v34.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.demo.v34.dao.DemoV34CoreDao;
import demo.v33.core.demo.v34.model.*;
import demo.v33.core.demo.v34.service.DemoV34CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoV34CoreServiceImpl implements DemoV34CoreService {

  private final DemoV34CoreDao demoV34CoreDao;

  @Override
  public Order createShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return demoV34CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return demoV34CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return demoV34CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return demoV34CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public Order updateShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return demoV34CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return demoV34CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
