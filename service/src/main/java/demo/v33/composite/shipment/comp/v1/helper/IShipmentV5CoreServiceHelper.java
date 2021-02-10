package demo.v33.composite.shipment.comp.v1.helper;

import java.util.List;
import demo.com.framework.core.utils.execution.ServiceRequestContext;
import com.abcd.uop.model.BadOrder;

public interface IShipmentV5CoreServiceHelper {

  com.abcd.uop.model.Order createShipment(String serviceCallId);

  ServiceRequestContext processCreateShipmentRequest(String serviceCallId);

  com.abcd.uop.model.Order processCreateShipmentResponse(String serviceCallId);

  com.abcd.uop.model.Order processCreateShipmentFallback(String serviceCallId, Throwable e);

  com.abcd.uop.model.Order updateShipment(String serviceCallId);

  ServiceRequestContext processUpdateShipmentRequest(String serviceCallId);

  com.abcd.uop.model.Order processUpdateShipmentResponse(String serviceCallId);

  com.abcd.uop.model.Order processUpdateShipmentFallback(String serviceCallId, Throwable e);

  BadOrder getShipmentByShipmentId(String serviceCallId);

  ServiceRequestContext processGetShipmentByShipmentIdRequest(String serviceCallId);

  BadOrder processGetShipmentByShipmentIdResponse(String serviceCallId);

  BadOrder processGetShipmentByShipmentIdFallback(String serviceCallId, Throwable e);

  com.abcd.uop.returning.model.Order getAllShipmentByPoNumber(String serviceCallId);

  ServiceRequestContext processGetAllShipmentByPoNumberRequest(String serviceCallId);

  com.abcd.uop.returning.model.Order processGetAllShipmentByPoNumberResponse(String serviceCallId);

  com.abcd.uop.returning.model.Order processGetAllShipmentByPoNumberFallback(
      String serviceCallId, Throwable e);

  com.abcd.uop.model.Order getShipmentByShipmentRef(String serviceCallId);

  ServiceRequestContext processGetShipmentByShipmentRefRequest(String serviceCallId);

  com.abcd.uop.model.Order processGetShipmentByShipmentRefResponse(String serviceCallId);

  com.abcd.uop.model.Order processGetShipmentByShipmentRefFallback(
      String serviceCallId, Throwable e);

  com.abcd.uop.model.Order getAllShipmentByOrderId(String serviceCallId);

  ServiceRequestContext processGetAllShipmentByOrderIdRequest(String serviceCallId);

  com.abcd.uop.model.Order processGetAllShipmentByOrderIdResponse(String serviceCallId);

  com.abcd.uop.model.Order processGetAllShipmentByOrderIdFallback(
      String serviceCallId, Throwable e);
}
