package demo.fihub.composite.air.v4.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.order.foundation.core.utils.logging.Logger;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.composite.air.v4.helper.AbstractOrderIdV7CoreServiceHelper;
import demo.fihub.core.order.id.v7.model.*;

@Component
public class OrderIdV7CoreServiceHelperImpl extends AbstractOrderIdV7CoreServiceHelper {

  public OrderIdV7CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
    super(restTemplate, logger);
  }

  @Override
  public ServiceRequestContext processGetReturnsByOrderIdRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public List<OrderTransactions> processGetReturnsByOrderIdResponse(String serviceCallId) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public List<OrderTransactions> processGetReturnsByOrderIdFallback(
      String serviceCallId, Throwable e) {
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
