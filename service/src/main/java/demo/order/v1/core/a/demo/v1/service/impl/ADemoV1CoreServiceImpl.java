package demo.order.v1.core.a.demo.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.a.demo.v1.dao.ADemoV1CoreDao;
import demo.order.v1.core.a.demo.v1.service.ADemoV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ADemoV1CoreServiceImpl implements ADemoV1CoreService {

  private final ADemoV1CoreDao aDemoV1CoreDao;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
