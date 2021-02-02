package demo.v33.core.demo.v36.service;

import java.util.*;
import demo.v33.core.demo.v36.model.*;

public interface IDemoV36CoreService {

  Order createShipment(Order shipmentRequest);

  Order getAllShipmentByPONumber(String ponumber);

  Order getShipmentByShipmentRef(String shipmentref);

  Order getAllShipmentByOrderId(String shipmentorderid);

  Order updateShipment(Order shipmentRequest);

  Order getShipmentByShipmentId(int shipmentid, String shipmentorderid);
}
