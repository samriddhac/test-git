package demo.fihub.core.aav.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.aav.dao.AavCoreDao;
import demo.fihub.core.aav.service.AavCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AavCoreServiceImpl implements AavCoreService {

  private final AavCoreDao aavCoreDao;

  public Double getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
