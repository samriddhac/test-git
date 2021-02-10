package demo.v33.composite.shipment.comp.v1;

import java.util.List;
import com.abcd.uop.model.BadOrder;

/** */
public interface IShipmentCompV1CompositeService {

  public com.abcd.uop.model.Order createShipment(com.abcd.uop.model.Order shipmentRequest);

  public com.abcd.uop.returning.model.Order getAllShipmentByPONumber(String ponumber);

  public com.abcd.uop.model.Order getShipmentByShipmentRef(String shipmentref);

  public com.abcd.uop.model.Order getAllShipmentByOrderId(String shipmentorderid);

  public com.abcd.uop.model.Order updateShipment(com.abcd.uop.model.Order shipmentRequest);

  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid);
}
