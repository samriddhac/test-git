package demo.order.v1.core.group.v2.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.group.v2.dao.GroupV2CoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.group.v2.service.GroupV2CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GroupV2CoreServiceImpl implements GroupV2CoreService {

  private final GroupV2CoreDao groupV2CoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return groupV2CoreDao.groupLogicalShipments(lineItemArray);
  }
}
