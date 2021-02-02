package demo.v33.core.avc.service;

import java.util.*;
import demo.v33.core.avc.model.*;

public interface IAvcCoreService {

  Order createShipment(Order shipmentRequest);

  Order getAllShipmentByPONumber(String ponumber);

  Order getShipmentByShipmentRef(String shipmentref);

  Order getAllShipmentByOrderId(String shipmentorderid);

  Order updateShipment(Order shipmentRequest);

  Order getShipmentByShipmentId(int shipmentid, String shipmentorderid);
}
