package demo.v33.core.avc.v3.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.v33.core.avc.v3.dao.AvcV3CoreDao;
import demo.v33.core.avc.v3.model.*;
import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AvcV3CoreDaoImpl implements AvcV3CoreDao {

  private final SpannerTemplate spannerTemplate;

  public Order createShipment(Order shipmentRequest) {
    // TODO: your code goes here...
    return null;
  }

  public Order getAllShipmentByPONumber(String ponumber) {
    // TODO: your code goes here...
    return null;
  }

  public Order getShipmentByShipmentRef(String shipmentref) {
    // TODO: your code goes here...
    return null;
  }

  public Order getAllShipmentByOrderId(String shipmentorderid) {
    // TODO: your code goes here...
    return null;
  }

  public Order updateShipment(Order shipmentRequest) {
    // TODO: your code goes here...
    return null;
  }

  public Order getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    // TODO: your code goes here...
    return null;
  }
}
