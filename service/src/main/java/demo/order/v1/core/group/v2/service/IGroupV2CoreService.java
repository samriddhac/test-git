package demo.order.v1.core.group.v2.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IGroupV2CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
