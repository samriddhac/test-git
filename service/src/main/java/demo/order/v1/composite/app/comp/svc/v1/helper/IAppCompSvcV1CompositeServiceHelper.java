package demo.order.v1.composite.app.comp.svc.v1.helper;

import java.util.List;
import com.abcd.uop.model.Order;

public interface IAppCompSvcV1CompositeServiceHelper {

  public void processGroupLogicalShipmentsRequest();

  public List<List<Order>> processGroupLogicalShipmentsResponse();

  public void processSplitLineItemsRequest();

  public List<List<Order>> processSplitLineItemsResponse();
}
