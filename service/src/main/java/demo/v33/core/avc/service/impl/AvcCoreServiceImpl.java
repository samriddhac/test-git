package demo.v33.core.avc.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.avc.dao.AvcCoreDao;
import demo.v33.core.avc.model.*;
import demo.v33.core.avc.service.AvcCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvcCoreServiceImpl implements AvcCoreService {

  private final AvcCoreDao avcCoreDao;

  @Override
  public Order createShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return avcCoreDao.createShipment(shipmentRequest);
  }

  @Override
  public Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return avcCoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return avcCoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return avcCoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public Order updateShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return avcCoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return avcCoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
