package demo.fihub.composite.air.v1.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.order.foundation.core.utils.logging.Logger;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.composite.air.v1.helper.AbstractAV1CoreServiceHelper;
import demo.fihub.core.a.v1.model.*;

@Component
public class AV1CoreServiceHelperImpl extends AbstractAV1CoreServiceHelper {

  public AV1CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
    super(restTemplate, logger);
  }

  @Override
  public ServiceRequestContext processGetReturnsByCustomerOrderIdRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public List<Order> processGetReturnsByCustomerOrderIdResponse(String serviceCallId) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public List<Order> processGetReturnsByCustomerOrderIdFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public ServiceRequestContext processPublishReturnProcessEventRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public Order processPublishReturnProcessEventResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public Order processPublishReturnProcessEventFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }
}
