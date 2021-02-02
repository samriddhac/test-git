package demo.v33.core.avc.v5.service;

import java.util.*;
import demo.v33.core.avc.v5.model.*;

public interface IAvcV5CoreService {

  Order createShipment(Order shipmentRequest);

  Order getAllShipmentByPONumber(String ponumber);

  Order getShipmentByShipmentRef(String shipmentref);

  Order getAllShipmentByOrderId(String shipmentorderid);

  Order updateShipment(Order shipmentRequest);

  Order getShipmentByShipmentId(int shipmentid, String shipmentorderid);
}
