package demo.order.v1.core.mapper.test.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IMapperTestCoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
