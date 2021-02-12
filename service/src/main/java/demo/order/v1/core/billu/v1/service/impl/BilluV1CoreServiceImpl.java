package demo.order.v1.core.billu.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.billu.v1.dao.BilluV1CoreDao;
import demo.order.v1.core.billu.v1.service.BilluV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BilluV1CoreServiceImpl implements BilluV1CoreService {

  private final BilluV1CoreDao billuV1CoreDao;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
