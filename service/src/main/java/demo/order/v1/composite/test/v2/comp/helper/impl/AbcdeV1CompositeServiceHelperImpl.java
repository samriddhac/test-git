package demo.order.v1.composite.test.v2.comp.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.order.v1.composite.test.v2.comp.helper.AbstractAbcdeV1CompositeServiceHelper;

@Component
public class AbcdeV1CompositeServiceHelperImpl extends AbstractAbcdeV1CompositeServiceHelper {

  public AbcdeV1CompositeServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
    super(restTemplate, logger);
  }

  @Override
  public ServiceRequestContext processGetOrderIdForCustomerOrderIdOrReservationIdRequest(
      String serviceCallId) {
    // TODO: your code goes here...
    return new ServiceRequestContext();
  }

  @Override
  public String processGetOrderIdForCustomerOrderIdOrReservationIdResponse(String serviceCallId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public String processGetOrderIdForCustomerOrderIdOrReservationIdFallback(
      String serviceCallId, Throwable e) {
    // TODO: your code goes here...
    return null;
  }
}
