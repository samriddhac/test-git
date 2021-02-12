package demo.order.v1.composite.order.collect.v33.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.order.v1.composite.order.collect.v33.helper.AbstractShipmentV4CoreServiceHelper;

@Component
public class ShipmentV4CoreServiceHelperImpl extends AbstractShipmentV4CoreServiceHelper {

  public ShipmentV4CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
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
}
