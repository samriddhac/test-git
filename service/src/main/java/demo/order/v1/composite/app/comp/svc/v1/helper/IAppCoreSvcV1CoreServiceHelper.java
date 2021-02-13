package demo.order.v1.composite.app.comp.svc.v1.helper;

import java.util.List;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import com.abcd.uop.model.Order;

public interface IAppCoreSvcV1CoreServiceHelper {

  Order[][] groupLogicalShipments(String serviceCallId);

  ServiceRequestContext processGroupLogicalShipmentsRequest(String serviceCallId);

  Order[][] processGroupLogicalShipmentsResponse(String serviceCallId);

  Order[][] processGroupLogicalShipmentsFallback(String serviceCallId, Throwable e);

  Order[][] splitLineItems(String serviceCallId);

  ServiceRequestContext processSplitLineItemsRequest(String serviceCallId);

  Order[][] processSplitLineItemsResponse(String serviceCallId);

  Order[][] processSplitLineItemsFallback(String serviceCallId, Throwable e);
}
