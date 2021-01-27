package demo.fihub.composite.air.v1.helper;

import java.util.List;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.core.a.v1.model.*;

public interface IAV1CoreServiceHelper {

  List<Order> getReturnsByCustomerOrderId(String serviceCallId);

  ServiceRequestContext processGetReturnsByCustomerOrderIdRequest(String serviceCallId);

  List<Order> processGetReturnsByCustomerOrderIdResponse(String serviceCallId);

  List<Order> processGetReturnsByCustomerOrderIdFallback(String serviceCallId, Throwable e);

  Order publishReturnProcessEvent(String serviceCallId);

  ServiceRequestContext processPublishReturnProcessEventRequest(String serviceCallId);

  Order processPublishReturnProcessEventResponse(String serviceCallId);

  Order processPublishReturnProcessEventFallback(String serviceCallId, Throwable e);
}
