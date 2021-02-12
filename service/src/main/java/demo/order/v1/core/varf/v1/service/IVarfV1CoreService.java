package demo.order.v1.core.varf.v1.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IVarfV1CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);
}
