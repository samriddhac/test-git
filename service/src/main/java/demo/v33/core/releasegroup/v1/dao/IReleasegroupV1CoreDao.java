package demo.v33.core.releasegroup.v1.dao;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IReleasegroupV1CoreDao {

  Object groupLogicalShipments(List<Order> lineItemArray);
}
