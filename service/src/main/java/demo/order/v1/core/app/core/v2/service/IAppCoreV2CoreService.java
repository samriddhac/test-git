package demo.order.v1.core.app.core.v2.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IAppCoreV2CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);

  List<List<Order>> splitLineItems(List<Order> lineItemArray);
}
