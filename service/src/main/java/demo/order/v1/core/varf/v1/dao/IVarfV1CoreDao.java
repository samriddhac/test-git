package demo.order.v1.core.varf.v1.dao;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IVarfV1CoreDao {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
