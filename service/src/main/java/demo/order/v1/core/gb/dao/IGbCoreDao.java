package demo.order.v1.core.gb.dao;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IGbCoreDao {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
