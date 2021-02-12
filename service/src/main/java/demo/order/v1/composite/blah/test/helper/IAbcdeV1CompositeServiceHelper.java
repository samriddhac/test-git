package demo.order.v1.composite.blah.test.helper;

import java.util.List;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;

public interface IAbcdeV1CompositeServiceHelper {

  String getOrderIdForCustomerOrderIdOrReservationId(String serviceCallId);

  ServiceRequestContext processGetOrderIdForCustomerOrderIdOrReservationIdRequest(
      String serviceCallId);

  String processGetOrderIdForCustomerOrderIdOrReservationIdResponse(String serviceCallId);

  String processGetOrderIdForCustomerOrderIdOrReservationIdFallback(
      String serviceCallId, Throwable e);
}
