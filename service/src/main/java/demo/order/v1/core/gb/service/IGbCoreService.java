package demo.order.v1.core.gb.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IGbCoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
