package demo.v33.core.avc.v5.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.avc.v5.dao.AvcV5CoreDao;
import demo.v33.core.avc.v5.model.*;
import demo.v33.core.avc.v5.service.AvcV5CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvcV5CoreServiceImpl implements AvcV5CoreService {

  private final AvcV5CoreDao avcV5CoreDao;

  @Override
  public Order createShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return avcV5CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return avcV5CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return avcV5CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return avcV5CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public Order updateShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return avcV5CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return avcV5CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
