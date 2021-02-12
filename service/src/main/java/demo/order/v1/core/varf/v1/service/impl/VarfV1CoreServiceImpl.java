package demo.order.v1.core.varf.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.varf.v1.dao.VarfV1CoreDao;
import com.abcd.uop.model.Order;
import demo.order.v1.core.varf.v1.service.VarfV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VarfV1CoreServiceImpl implements VarfV1CoreService {

  private final VarfV1CoreDao varfV1CoreDao;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    // HINT: your code goes here...
    return varfV1CoreDao.groupLogicalShipments(lineItemArray);
  }
}
