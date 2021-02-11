package demo.order.v1.composite.shipment.v2.comp.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.shipment.v2.comp.helper.IShipmentV2CompCompositeServiceHelper;
import com.abcd.uop.model.BadOrder;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ShipmentV2CompCompositeServiceHelperImpl
    implements IShipmentV2CompCompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processCreateShipmentRequest() {
    // TODO: your code goes here...
    enableServiceCall("e91ed56c-8371-4451-bf24-9a425a18f806");
  }

  @Override
  public com.abcd.uop.model.Order processCreateShipmentResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetAllShipmentByPONumberRequest() {
    // TODO: your code goes here...
    enableServiceCall("65535981-566f-4949-a1e4-a59cfcfc62d9");
  }

  @Override
  public com.abcd.uop.returning.model.Order processGetAllShipmentByPONumberResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetShipmentByShipmentRefRequest() {
    // TODO: your code goes here...
    enableServiceCall("ac3bb56c-6298-4e02-9baa-0e3c2b8ea648");
  }

  @Override
  public com.abcd.uop.model.Order processGetShipmentByShipmentRefResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetAllShipmentByOrderIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("d0ba191e-3119-499f-9819-13dbf10edbec");
  }

  @Override
  public com.abcd.uop.model.Order processGetAllShipmentByOrderIdResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processUpdateShipmentRequest() {
    // TODO: your code goes here...
    enableServiceCall("a92ec102-48b0-4b5b-90b3-bf47c20ae26a");
  }

  @Override
  public com.abcd.uop.model.Order processUpdateShipmentResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetShipmentByShipmentIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("494fcc67-51b7-47c2-a528-4d76cc2ba945");
  }

  @Override
  public BadOrder processGetShipmentByShipmentIdResponse() {
    // TODO: your code goes here...
    return null;
  }
}
