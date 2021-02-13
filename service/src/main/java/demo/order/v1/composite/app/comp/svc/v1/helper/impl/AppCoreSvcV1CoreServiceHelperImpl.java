package demo.order.v1.composite.app.comp.svc.v1.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.order.v1.composite.app.comp.svc.v1.helper.AbstractAppCoreSvcV1CoreServiceHelper;
import com.abcd.uop.model.Order;

@Component
public class AppCoreSvcV1CoreServiceHelperImpl extends AbstractAppCoreSvcV1CoreServiceHelper {

  public AppCoreSvcV1CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
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

  @Override
  public ServiceRequestContext processSplitLineItemsRequest(String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public List<List<Order>> processSplitLineItemsResponse(String serviceCallId) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public List<List<Order>> processSplitLineItemsFallback(String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return Collections.emptyList();
  }
}
