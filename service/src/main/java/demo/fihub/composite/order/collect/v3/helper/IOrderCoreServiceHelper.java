package demo.fihub.composite.order.collect.v3.helper;

import java.util.List;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import demo.fihub.core.order.model.*;

public interface IOrderCoreServiceHelper {

  List<Order> getReturnsByCustomerOrderId(String serviceCallId);

  ServiceRequestContext processGetReturnsByCustomerOrderIdRequest(String serviceCallId);

  List<Order> processGetReturnsByCustomerOrderIdResponse(String serviceCallId);

  List<Order> processGetReturnsByCustomerOrderIdFallback(String serviceCallId, Throwable e);

  List<OrderTransactions> getReturnsByOrderId(String serviceCallId);

  ServiceRequestContext processGetReturnsByOrderIdRequest(String serviceCallId);

  List<OrderTransactions> processGetReturnsByOrderIdResponse(String serviceCallId);

  List<OrderTransactions> processGetReturnsByOrderIdFallback(String serviceCallId, Throwable e);
}
