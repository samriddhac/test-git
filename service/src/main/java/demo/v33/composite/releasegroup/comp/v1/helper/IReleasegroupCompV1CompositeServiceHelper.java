package demo.v33.composite.releasegroup.comp.v1.helper;

import java.util.List;
import com.abcd.uop.model.Order;

public interface IReleasegroupCompV1CompositeServiceHelper {

  public void processGroupLogicalShipmentsRequest();

  public List<List<Order>> processGroupLogicalShipmentsResponse();
}
