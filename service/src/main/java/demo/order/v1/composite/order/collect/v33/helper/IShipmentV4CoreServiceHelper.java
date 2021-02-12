package demo.order.v1.composite.order.collect.v33.helper;

import java.util.List;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;

public interface IShipmentV4CoreServiceHelper {

  com.abcd.uop.model.Order createShipment(String serviceCallId);

  ServiceRequestContext processCreateShipmentRequest(String serviceCallId);

  com.abcd.uop.model.Order processCreateShipmentResponse(String serviceCallId);

  com.abcd.uop.model.Order processCreateShipmentFallback(String serviceCallId, Throwable e);

  com.abcd.uop.model.Order updateShipment(String serviceCallId);

  ServiceRequestContext processUpdateShipmentRequest(String serviceCallId);

  com.abcd.uop.model.Order processUpdateShipmentResponse(String serviceCallId);

  com.abcd.uop.model.Order processUpdateShipmentFallback(String serviceCallId, Throwable e);
}
