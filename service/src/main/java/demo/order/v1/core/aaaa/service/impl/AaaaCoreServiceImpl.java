package demo.order.v1.core.aaaa.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.aaaa.dao.AaaaCoreDao;
import demo.order.v1.core.aaaa.service.AaaaCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AaaaCoreServiceImpl implements AaaaCoreService {

  private final AaaaCoreDao aaaaCoreDao;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
