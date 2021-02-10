package demo.v33.core.releasegroup.v1.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IReleasegroupV1CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
