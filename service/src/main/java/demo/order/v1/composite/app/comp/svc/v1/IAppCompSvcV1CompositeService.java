package demo.order.v1.composite.app.comp.svc.v1;

import java.util.List;
import com.abcd.uop.model.Order;

/** */
public interface IAppCompSvcV1CompositeService {

  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);

  public List<List<Order>> splitLineItems(List<Order> lineItemArray);
}
