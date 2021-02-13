package demo.order.v1.composite.app.array.v1.helper;

import java.util.List;
import com.abcd.uop.model.Order;

public interface IAppArrayV1CompositeServiceHelper {

  public void processGroupLogicalShipmentsRequest();

  public List<List<Order>> processGroupLogicalShipmentsResponse();

  public void processSplitLineItemsRequest();

  public List<List<Order>> processSplitLineItemsResponse();
}
