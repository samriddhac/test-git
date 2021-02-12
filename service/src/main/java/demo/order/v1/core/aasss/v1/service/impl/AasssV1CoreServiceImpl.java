package demo.order.v1.core.aasss.v1.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.aasss.v1.dao.AasssV1CoreDao;
import demo.order.v1.core.aasss.v1.service.AasssV1CoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AasssV1CoreServiceImpl implements AasssV1CoreService {

  private final AasssV1CoreDao aasssV1CoreDao;

  public Double getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
