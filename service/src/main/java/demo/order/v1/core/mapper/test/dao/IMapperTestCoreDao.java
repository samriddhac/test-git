package demo.order.v1.core.mapper.test.dao;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IMapperTestCoreDao {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
