package demo.order.v1.core.app.core.v2.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.app.core.v2.dao.AppCoreV2CoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.app.core.v2.service.AppCoreV2CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppCoreV2CoreServiceImpl implements AppCoreV2CoreService {

  private final AppCoreV2CoreDao appCoreV2CoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return appCoreV2CoreDao.groupLogicalShipments(lineItemArray);
  }

  @Override
  public List<List<Order>> splitLineItems(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return appCoreV2CoreDao.splitLineItems(lineItemArray);
  }
}
