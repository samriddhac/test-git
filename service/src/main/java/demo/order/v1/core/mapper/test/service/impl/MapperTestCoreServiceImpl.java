package demo.order.v1.core.mapper.test.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.mapper.test.dao.MapperTestCoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.mapper.test.service.MapperTestCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MapperTestCoreServiceImpl implements MapperTestCoreService {

  private final MapperTestCoreDao mapperTestCoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return mapperTestCoreDao.groupLogicalShipments(lineItemArray);
  }
}
