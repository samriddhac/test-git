package demo.order.v1.core.group.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.group.v1.dao.GroupV1CoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.group.v1.service.GroupV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GroupV1CoreServiceImpl implements GroupV1CoreService {

  private final GroupV1CoreDao groupV1CoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return groupV1CoreDao.groupLogicalShipments(lineItemArray);
  }
}
