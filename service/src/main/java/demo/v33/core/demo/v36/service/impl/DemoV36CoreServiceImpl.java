package demo.v33.core.demo.v36.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.demo.v36.model.*;
import demo.v33.core.demo.v36.service.DemoV36CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DemoV36CoreServiceImpl implements DemoV36CoreService {

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
