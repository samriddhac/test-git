package demo.v33.composite.releasegroup.comp.v1.helper;

import java.util.List;
import demo.com.framework.core.utils.execution.ServiceRequestContext;
import com.abcd.uop.model.Order;

public interface IReleasegroupV1CoreServiceHelper {

  Order[] groupLogicalShipments(String serviceCallId);

  ServiceRequestContext processGroupLogicalShipmentsRequest(String serviceCallId);

  Order[] processGroupLogicalShipmentsResponse(String serviceCallId);

  Order[] processGroupLogicalShipmentsFallback(String serviceCallId, Throwable e);
}
