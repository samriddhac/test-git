package demo.order.v1.composite.shipment.v2.comp.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.order.v1.composite.shipment.v2.comp.helper.AbstractShipmentV3CoreServiceHelper;
import com.abcd.uop.model.BadOrder;

@Component
public class ShipmentV3CoreServiceHelperImpl extends AbstractShipmentV3CoreServiceHelper {

  public ShipmentV3CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
    super(restTemplate, logger);
  }

  @Override
  public ServiceRequestContext processCreateShipmentRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public com.abcd.uop.model.Order processCreateShipmentResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public com.abcd.uop.model.Order processCreateShipmentFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public ServiceRequestContext processUpdateShipmentRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public com.abcd.uop.model.Order processUpdateShipmentResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public com.abcd.uop.model.Order processUpdateShipmentFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public ServiceRequestContext processGetShipmentByShipmentIdRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public BadOrder processGetShipmentByShipmentIdResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public BadOrder processGetShipmentByShipmentIdFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public ServiceRequestContext processGetAllShipmentByPoNumberRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public com.abcd.uop.returning.model.Order processGetAllShipmentByPoNumberResponse(
      String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public com.abcd.uop.returning.model.Order processGetAllShipmentByPoNumberFallback(
      String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public ServiceRequestContext processGetShipmentByShipmentRefRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public com.abcd.uop.model.Order processGetShipmentByShipmentRefResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public com.abcd.uop.model.Order processGetShipmentByShipmentRefFallback(
      String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public ServiceRequestContext processGetAllShipmentByOrderIdRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public com.abcd.uop.model.Order processGetAllShipmentByOrderIdResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public com.abcd.uop.model.Order processGetAllShipmentByOrderIdFallback(
      String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }
}
