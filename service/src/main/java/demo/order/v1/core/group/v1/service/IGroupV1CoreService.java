package demo.order.v1.core.group.v1.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IGroupV1CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
