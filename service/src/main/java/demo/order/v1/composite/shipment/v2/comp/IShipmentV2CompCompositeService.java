package demo.order.v1.composite.shipment.v2.comp;

import java.util.List;
import com.abcd.uop.model.BadOrder;

/** */
public interface IShipmentV2CompCompositeService {

  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest);

  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber);

  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref);

  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid);

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest);

  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid);
}
