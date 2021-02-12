package demo.order.v1.core.mapper.v2.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.mapper.v2.dao.MapperV2CoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.mapper.v2.service.MapperV2CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MapperV2CoreServiceImpl implements MapperV2CoreService {

  private final MapperV2CoreDao mapperV2CoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return mapperV2CoreDao.groupLogicalShipments(lineItemArray);
  }

  @Override
  public List<List<Order>> splitLineItems(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return mapperV2CoreDao.splitLineItems(lineItemArray);
  }
}
