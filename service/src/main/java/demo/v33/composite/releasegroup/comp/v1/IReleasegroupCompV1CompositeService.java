package demo.v33.composite.releasegroup.comp.v1;

import java.util.List;
import com.abcd.uop.model.Order;

/** */
public interface IReleasegroupCompV1CompositeService {

  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
