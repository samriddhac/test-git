package demo.order.v1.core.aasss.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.order.v1.core.aasss.dao.AasssCoreDao;
import demo.order.v1.core.aasss.service.AasssCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AasssCoreServiceImpl implements AasssCoreService {

  private final AasssCoreDao aasssCoreDao;

  public Double getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
