package demo.order.v1.core.group.v1.dao;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IGroupV1CoreDao {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
