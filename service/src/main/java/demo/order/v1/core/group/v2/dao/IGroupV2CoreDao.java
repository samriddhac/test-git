package demo.order.v1.core.group.v2.dao;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IGroupV2CoreDao {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
