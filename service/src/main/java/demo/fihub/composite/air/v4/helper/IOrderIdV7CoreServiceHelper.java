package demo.fihub.composite.air.v4.helper;

import java.util.List;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.core.order.id.v7.model.*;

public interface IOrderIdV7CoreServiceHelper {

  List<OrderTransactions> getReturnsByOrderId(String serviceCallId);

  ServiceRequestContext processGetReturnsByOrderIdRequest(String serviceCallId);

  List<OrderTransactions> processGetReturnsByOrderIdResponse(String serviceCallId);

  List<OrderTransactions> processGetReturnsByOrderIdFallback(String serviceCallId, Throwable e);

  Order publishReturnProcessEvent(String serviceCallId);

  ServiceRequestContext processPublishReturnProcessEventRequest(String serviceCallId);

  Order processPublishReturnProcessEventResponse(String serviceCallId);

  Order processPublishReturnProcessEventFallback(String serviceCallId, Throwable e);
}
