package demo.order.v1.core.bcdf.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.bcdf.v1.dao.BcdfV1CoreDao;
import demo.order.v1.core.bcdf.v1.service.BcdfV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BcdfV1CoreServiceImpl implements BcdfV1CoreService {

  private final BcdfV1CoreDao bcdfV1CoreDao;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
