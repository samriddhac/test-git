package demo.v33.composite.shipment.comp.v1.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import demo.com.framework.core.utils.execution.ServiceExecutionContextUtil;
import demo.v33.composite.shipment.comp.v1.helper.IShipmentCompV1CompositeServiceHelper;
import com.abcd.uop.model.BadOrder;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ShipmentCompV1CompositeServiceHelperImpl
    implements IShipmentCompV1CompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processCreateShipmentRequest() {
    // TODO: your code goes here...
    enableServiceCall("136a56f2-b1c8-4b06-b247-dfe94f7cb813");
  }

  @Override
  public com.abcd.uop.model.Order processCreateShipmentResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetAllShipmentByPONumberRequest() {
    // TODO: your code goes here...
    enableServiceCall("1f2e5a71-c81d-4f23-a961-37af876a75e7");
  }

  @Override
  public com.abcd.uop.returning.model.Order processGetAllShipmentByPONumberResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetShipmentByShipmentRefRequest() {
    // TODO: your code goes here...
    enableServiceCall("3609c144-fb7b-472c-8aa9-0ef699efc595");
  }

  @Override
  public com.abcd.uop.model.Order processGetShipmentByShipmentRefResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetAllShipmentByOrderIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("86c98ab1-01ef-4dd4-86cf-1e816d4fd169");
  }

  @Override
  public com.abcd.uop.model.Order processGetAllShipmentByOrderIdResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processUpdateShipmentRequest() {
    // TODO: your code goes here...
    enableServiceCall("f2c83ae1-28c8-4aad-b5f7-54bf5c2079d0");
  }

  @Override
  public com.abcd.uop.model.Order processUpdateShipmentResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetShipmentByShipmentIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("5efd2445-46ac-485c-b14e-1a75da5db161");
  }

  @Override
  public BadOrder processGetShipmentByShipmentIdResponse() {
    // TODO: your code goes here...
    return null;
  }
}
