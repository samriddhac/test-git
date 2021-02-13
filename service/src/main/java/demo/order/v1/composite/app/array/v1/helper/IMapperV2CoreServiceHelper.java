package demo.order.v1.composite.app.array.v1.helper;

import java.util.List;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import com.abcd.uop.model.Order;

public interface IMapperV2CoreServiceHelper {

  Order[] groupLogicalShipments(String serviceCallId);

  ServiceRequestContext processGroupLogicalShipmentsRequest(String serviceCallId);

  Order[] processGroupLogicalShipmentsResponse(String serviceCallId);

  Order[] processGroupLogicalShipmentsFallback(String serviceCallId, Throwable e);

  Order[] splitLineItems(String serviceCallId);

  ServiceRequestContext processSplitLineItemsRequest(String serviceCallId);

  Order[] processSplitLineItemsResponse(String serviceCallId);

  Order[] processSplitLineItemsFallback(String serviceCallId, Throwable e);
}
