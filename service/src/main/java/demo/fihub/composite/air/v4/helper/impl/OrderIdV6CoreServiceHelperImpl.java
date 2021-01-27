package demo.fihub.composite.air.v4.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.order.foundation.core.utils.logging.Logger;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.composite.air.v4.helper.AbstractOrderIdV6CoreServiceHelper;
import demo.fihub.core.order.id.v6.model.*;

@Component
public class OrderIdV6CoreServiceHelperImpl extends AbstractOrderIdV6CoreServiceHelper {

  public OrderIdV6CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
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
}
