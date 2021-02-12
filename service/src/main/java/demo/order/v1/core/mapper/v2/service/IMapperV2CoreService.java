package demo.order.v1.core.mapper.v2.service;

import java.util.*;
import com.abcd.uop.model.Order;

public interface IMapperV2CoreService {

  List<List<Order>> groupLogicalShipments(List<Order> lineItemArray);

  List<List<Order>> splitLineItems(List<Order> lineItemArray);
}
