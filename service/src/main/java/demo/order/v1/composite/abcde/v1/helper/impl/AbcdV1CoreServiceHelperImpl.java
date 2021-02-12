package demo.order.v1.composite.abcde.v1.helper.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.order.v1.composite.abcde.v1.helper.AbstractAbcdV1CoreServiceHelper;

@Component
public class AbcdV1CoreServiceHelperImpl extends AbstractAbcdV1CoreServiceHelper {

  public AbcdV1CoreServiceHelperImpl(RestTemplate restTemplate, Logger logger) {
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
