package demo.order.v1.core.shipment.v4.service;

import java.util.*;
import com.abcd.uop.model.BadOrder;

public interface IShipmentV4CoreService {

  com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest);

  com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber);

  com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref);

  com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid);

  com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest);

  BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid);
}
