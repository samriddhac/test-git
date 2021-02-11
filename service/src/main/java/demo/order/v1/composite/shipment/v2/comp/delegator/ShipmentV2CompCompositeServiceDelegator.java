package demo.order.v1.composite.shipment.v2.comp.delegator;

import com.abcd.uop.model.BadOrder;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.shipment.v2.comp.IShipmentV2CompCompositeService;
import demo.order.v1.composite.shipment.v2.comp.helper.IShipmentV2CompCompositeServiceHelper;
import demo.order.v1.composite.shipment.v2.comp.helper.IShipmentV3CoreServiceHelper;
import java.lang.Override;
import java.lang.String;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ShipmentV2CompCompositeServiceDelegator
    implements IShipmentV2CompCompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IShipmentV2CompCompositeServiceHelper shipmentV2CompCompositeServiceHelper;

  private final IShipmentV3CoreServiceHelper shipmentV3CoreServiceHelper;

  @Override
  public void createShipment() {
    shipmentV2CompCompositeServiceHelper.processCreateShipmentRequest();
    if (isServiceCallEnabled("e91ed56c-8371-4451-bf24-9a425a18f806")) {
      shipmentV3CoreServiceHelper.createShipment("e91ed56c-8371-4451-bf24-9a425a18f806");
    }
    shipmentV2CompCompositeServiceHelper.processCreateShipmentResponse();
  }

  @Override
  public void getAllShipmentByPONumber(String ponumber) {
    shipmentV2CompCompositeServiceHelper.processGetAllShipmentByPONumberRequest();
    if (isServiceCallEnabled("65535981-566f-4949-a1e4-a59cfcfc62d9")) {
      shipmentV3CoreServiceHelper.getAllShipmentByPoNumber("65535981-566f-4949-a1e4-a59cfcfc62d9");
    }
    shipmentV2CompCompositeServiceHelper.processGetAllShipmentByPONumberResponse();
  }

  @Override
  public void getShipmentByShipmentRef(String shipmentref) {
    shipmentV2CompCompositeServiceHelper.processGetShipmentByShipmentRefRequest();
    if (isServiceCallEnabled("ac3bb56c-6298-4e02-9baa-0e3c2b8ea648")) {
      shipmentV3CoreServiceHelper.getShipmentByShipmentRef("ac3bb56c-6298-4e02-9baa-0e3c2b8ea648");
    }
    shipmentV2CompCompositeServiceHelper.processGetShipmentByShipmentRefResponse();
  }

  @Override
  public void getAllShipmentByOrderId(String shipmentorderid) {
    shipmentV2CompCompositeServiceHelper.processGetAllShipmentByOrderIdRequest();
    if (isServiceCallEnabled("d0ba191e-3119-499f-9819-13dbf10edbec")) {
      shipmentV3CoreServiceHelper.getAllShipmentByOrderId("d0ba191e-3119-499f-9819-13dbf10edbec");
    }
    shipmentV2CompCompositeServiceHelper.processGetAllShipmentByOrderIdResponse();
  }

  @Override
  public void updateShipment() {
    shipmentV2CompCompositeServiceHelper.processUpdateShipmentRequest();
    if (isServiceCallEnabled("a92ec102-48b0-4b5b-90b3-bf47c20ae26a")) {
      shipmentV3CoreServiceHelper.updateShipment("a92ec102-48b0-4b5b-90b3-bf47c20ae26a");
    }
    shipmentV2CompCompositeServiceHelper.processUpdateShipmentResponse();
  }

  @Override
  public BadOrder getShipmentByShipmentId(int shipmentid, String shipmentorderid) {
    shipmentV2CompCompositeServiceHelper.processGetShipmentByShipmentIdRequest();
    if (isServiceCallEnabled("494fcc67-51b7-47c2-a528-4d76cc2ba945")) {
      shipmentV3CoreServiceHelper.getShipmentByShipmentId("494fcc67-51b7-47c2-a528-4d76cc2ba945");
    }
    return shipmentV2CompCompositeServiceHelper.processGetShipmentByShipmentIdResponse();
  }
}
