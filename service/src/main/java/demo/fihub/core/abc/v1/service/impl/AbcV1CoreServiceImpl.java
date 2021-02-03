package demo.fihub.core.abc.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.abc.v1.model.*;
import demo.fihub.core.abc.v1.service.AbcV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AbcV1CoreServiceImpl implements AbcV1CoreService {

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
