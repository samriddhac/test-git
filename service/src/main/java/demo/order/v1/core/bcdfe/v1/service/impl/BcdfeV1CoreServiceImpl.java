package demo.order.v1.core.bcdfe.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.bcdfe.v1.dao.BcdfeV1CoreDao;
import com.abcd.uop.model.BadOrder;
import demo.order.v1.core.bcdfe.v1.service.BcdfeV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BcdfeV1CoreServiceImpl implements BcdfeV1CoreService {

  private final BcdfeV1CoreDao bcdfeV1CoreDao;

  @Override
  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return bcdfeV1CoreDao.createShipment(shipmentRequest);
  }

  @Override
  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber) {
    // HINT: your code goes here...
    return bcdfeV1CoreDao.getAllShipmentByPONumber(ponumber);
  }

  @Override
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref) {
    // HINT: your code goes here...
    return bcdfeV1CoreDao.getShipmentByShipmentRef(shipmentref);
  }

  @Override
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid) {
    // HINT: your code goes here...
    return bcdfeV1CoreDao.getAllShipmentByOrderId(shipmentorderid);
  }

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest) {
    // HINT: your code goes here...
    return bcdfeV1CoreDao.updateShipment(shipmentRequest);
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // HINT: your code goes here...
    return bcdfeV1CoreDao.getShipmentByShipmentId(shipmentid, shipmentorderid);
  }
}
