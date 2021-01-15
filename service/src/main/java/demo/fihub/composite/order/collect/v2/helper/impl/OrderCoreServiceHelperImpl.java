package demo.fihub.composite.order.collect.v2.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.composite.order.collect.v2.helper.AbstractOrderCoreServiceHelper;
import demo.fihub.core.order.model.*;

@Component
public class OrderCoreServiceHelperImpl extends AbstractOrderCoreServiceHelper {

  public OrderCoreServiceHelperImpl(RestTemplate restTemplate) {
    super(restTemplate);
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
}
