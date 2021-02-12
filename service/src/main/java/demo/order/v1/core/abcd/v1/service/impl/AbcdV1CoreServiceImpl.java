package demo.order.v1.core.abcd.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.abcd.v1.dao.AbcdV1CoreDao;
import demo.order.v1.core.abcd.v1.service.AbcdV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AbcdV1CoreServiceImpl implements AbcdV1CoreService {

  private final AbcdV1CoreDao abcdV1CoreDao;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
