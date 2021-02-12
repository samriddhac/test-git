package demo.order.v1.composite.abcde.v1.helper;

import java.util.List;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;

public interface IAbcdV1CoreServiceHelper {

  String getOrderIdForCustomerOrderIdOrReservationId(String serviceCallId);

  ServiceRequestContext processGetOrderIdForCustomerOrderIdOrReservationIdRequest(
      String serviceCallId);

  String processGetOrderIdForCustomerOrderIdOrReservationIdResponse(String serviceCallId);

  String processGetOrderIdForCustomerOrderIdOrReservationIdFallback(
      String serviceCallId, Throwable e);
}
