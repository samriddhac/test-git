package demo.fihub.composite.air.v4.helper;

import java.util.List;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.core.order.id.v6.model.*;

public interface IOrderIdV6CoreServiceHelper {

  List<Order> getReturnsByCustomerOrderId(String serviceCallId);

  ServiceRequestContext processGetReturnsByCustomerOrderIdRequest(String serviceCallId);

  List<Order> processGetReturnsByCustomerOrderIdResponse(String serviceCallId);

  List<Order> processGetReturnsByCustomerOrderIdFallback(String serviceCallId, Throwable e);
}
