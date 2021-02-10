package demo.v33.composite.shipment.comp.v1.helper;

import java.util.List;
import com.abcd.uop.model.BadOrder;

public interface IShipmentCompV1CompositeServiceHelper {

  public void processCreateShipmentRequest();

  public com.abcd.uop.model.Order processCreateShipmentResponse();

  public void processGetAllShipmentByPONumberRequest();

  public com.abcd.uop.returning.model.Order processGetAllShipmentByPONumberResponse();

  public void processGetShipmentByShipmentRefRequest();

  public com.abcd.uop.model.Order processGetShipmentByShipmentRefResponse();

  public void processGetAllShipmentByOrderIdRequest();

  public com.abcd.uop.model.Order processGetAllShipmentByOrderIdResponse();

  public void processUpdateShipmentRequest();

  public com.abcd.uop.model.Order processUpdateShipmentResponse();

  public void processGetShipmentByShipmentIdRequest();

  public BadOrder processGetShipmentByShipmentIdResponse();
}
