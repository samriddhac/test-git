package demo.v33.core.avc.v3.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.avc.v3.dao.AvcV3CoreDao;
import demo.v33.core.avc.v3.model.*;
import demo.v33.core.avc.v3.service.AvcV3CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvcV3CoreServiceImpl implements AvcV3CoreService {

  private final AvcV3CoreDao avcV3CoreDao;

  @Override
  public Order createShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return avcV3CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return avcV3CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return avcV3CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return avcV3CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public Order updateShipment(Order shipmentRequest) {
    // HINT: your code goes here...
    return avcV3CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return avcV3CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
