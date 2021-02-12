package demo.order.v1.core.gb.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.gb.dao.GbCoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.gb.service.GbCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GbCoreServiceImpl implements GbCoreService {

  private final GbCoreDao gbCoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return gbCoreDao.groupLogicalShipments(lineItemArray);
  }
}
