package demo.order.v1.core.app.core.svc.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.app.core.svc.v1.dao.AppCoreSvcV1CoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.app.core.svc.v1.service.AppCoreSvcV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppCoreSvcV1CoreServiceImpl implements AppCoreSvcV1CoreService {

  private final AppCoreSvcV1CoreDao appCoreSvcV1CoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return appCoreSvcV1CoreDao.groupLogicalShipments(lineItemArray);
  }

  @Override
  public List<List<Order>> splitLineItems(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return appCoreSvcV1CoreDao.splitLineItems(lineItemArray);
  }
}
