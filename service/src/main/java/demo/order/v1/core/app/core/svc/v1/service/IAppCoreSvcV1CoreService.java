package demo.order.v1.core.app.core.svc.v1.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IAppCoreSvcV1CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);

  List<List<Order>> splitLineItems(List<Order> lineItemArray);
}
