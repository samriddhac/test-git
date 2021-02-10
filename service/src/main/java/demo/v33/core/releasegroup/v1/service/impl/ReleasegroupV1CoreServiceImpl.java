package demo.v33.core.releasegroup.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.v33.core.releasegroup.v1.dao.ReleasegroupV1CoreDao;
import com.abcd.uop.model.Order;
import demo.v33.core.releasegroup.v1.service.ReleasegroupV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReleasegroupV1CoreServiceImpl implements ReleasegroupV1CoreService {

  private final ReleasegroupV1CoreDao releasegroupV1CoreDao;

  @Override
  public Object groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return releasegroupV1CoreDao.groupLogicalShipments(lineItemArray);
  }
}
