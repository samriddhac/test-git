package demo.order.v1.composite.shipment.v2.comp.helper;

import java.util.List;
import com.abcd.uop.model.BadOrder;

public interface IShipmentV2CompCompositeServiceHelper {

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
