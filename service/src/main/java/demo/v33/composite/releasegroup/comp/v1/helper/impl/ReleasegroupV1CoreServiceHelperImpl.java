package demo.v33.composite.releasegroup.comp.v1.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.execution.ServiceRequestContext;
import demo.v33.composite.releasegroup.comp.v1.helper.AbstractReleasegroupV1CoreServiceHelper;
import com.abcd.uop.model.Order;

@Component
public class ReleasegroupV1CoreServiceHelperImpl extends AbstractReleasegroupV1CoreServiceHelper {

  public ReleasegroupV1CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
    super(restTemplate, logger);
  }

  @Override
  public ServiceRequestContext processGroupLogicalShipmentsRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public List<List<Order>> processGroupLogicalShipmentsResponse(String serviceCallId) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public List<List<Order>> processGroupLogicalShipmentsFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }
}
