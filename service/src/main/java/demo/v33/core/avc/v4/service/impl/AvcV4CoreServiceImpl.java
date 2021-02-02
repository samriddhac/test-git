package demo.v33.core.avc.v4.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.avc.v4.model.*;
import demo.v33.core.avc.v4.service.AvcV4CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AvcV4CoreServiceImpl implements AvcV4CoreService {

  @Override
  public Order createShipment(Order shipmentRequest) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order getAllShipmentByPONumber(String ponumber) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order getShipmentByShipmentRef(String shipmentref) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order updateShipment(Order shipmentRequest) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // TODO: your code goes here...
    return null;
  }
}
