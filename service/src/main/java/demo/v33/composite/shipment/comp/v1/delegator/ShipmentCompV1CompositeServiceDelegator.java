package demo.v33.composite.shipment.comp.v1.delegator;

import com.abcd.uop.model.BadOrder;
import demo.com.framework.core.utils.execution.ServiceExecutionContextUtil;
import demo.com.framework.core.utils.future.FutureUtils;
import demo.v33.composite.shipment.comp.v1.IShipmentCompV1CompositeService;
import demo.v33.composite.shipment.comp.v1.helper.IShipmentCompV1CompositeServiceHelper;
import demo.v33.composite.shipment.comp.v1.helper.IShipmentV5CoreServiceHelper;
import java.lang.Override;
import java.lang.String;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShipmentCompV1CompositeServiceDelegator
    implements IShipmentCompV1CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IShipmentCompV1CompositeServiceHelper shipmentCompV1CompositeServiceHelper;

  private final IShipmentV5CoreServiceHelper shipmentV5CoreServiceHelper;

  @Override
  public void createShipment() {
    shipmentCompV1CompositeServiceHelper.processCreateShipmentRequest();
    if (isServiceCallEnabled("136a56f2-b1c8-4b06-b247-dfe94f7cb813")) {
      shipmentV5CoreServiceHelper.createShipment("136a56f2-b1c8-4b06-b247-dfe94f7cb813");
    }
    shipmentCompV1CompositeServiceHelper.processCreateShipmentResponse();
  }

  @Override
  public void getAllShipmentByPONumber(String ponumber) {
    shipmentCompV1CompositeServiceHelper.processGetAllShipmentByPONumberRequest();
    if (isServiceCallEnabled("1f2e5a71-c81d-4f23-a961-37af876a75e7")) {
      shipmentV5CoreServiceHelper.getAllShipmentByPoNumber("1f2e5a71-c81d-4f23-a961-37af876a75e7");
    }
    shipmentCompV1CompositeServiceHelper.processGetAllShipmentByPONumberResponse();
  }

  @Override
  public void getShipmentByShipmentRef(String shipmentref) {
    shipmentCompV1CompositeServiceHelper.processGetShipmentByShipmentRefRequest();
    if (isServiceCallEnabled("3609c144-fb7b-472c-8aa9-0ef699efc595")) {
      shipmentV5CoreServiceHelper.getShipmentByShipmentRef("3609c144-fb7b-472c-8aa9-0ef699efc595");
    }
    shipmentCompV1CompositeServiceHelper.processGetShipmentByShipmentRefResponse();
  }

  @Override
  public void getAllShipmentByOrderId(String shipmentorderid) {
    shipmentCompV1CompositeServiceHelper.processGetAllShipmentByOrderIdRequest();
    if (isServiceCallEnabled("86c98ab1-01ef-4dd4-86cf-1e816d4fd169")) {
      shipmentV5CoreServiceHelper.getAllShipmentByOrderId("86c98ab1-01ef-4dd4-86cf-1e816d4fd169");
    }
    shipmentCompV1CompositeServiceHelper.processGetAllShipmentByOrderIdResponse();
  }

  @Override
  public void updateShipment() {
    shipmentCompV1CompositeServiceHelper.processUpdateShipmentRequest();
    if (isServiceCallEnabled("f2c83ae1-28c8-4aad-b5f7-54bf5c2079d0")) {
      shipmentV5CoreServiceHelper.updateShipment("f2c83ae1-28c8-4aad-b5f7-54bf5c2079d0");
    }
    shipmentCompV1CompositeServiceHelper.processUpdateShipmentResponse();
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    shipmentCompV1CompositeServiceHelper.processGetShipmentByShipmentIdRequest();
    if (isServiceCallEnabled("5efd2445-46ac-485c-b14e-1a75da5db161")) {
      shipmentV5CoreServiceHelper.getShipmentByShipmentId("5efd2445-46ac-485c-b14e-1a75da5db161");
    }
    return shipmentCompV1CompositeServiceHelper.processGetShipmentByShipmentIdResponse();
  }
}
