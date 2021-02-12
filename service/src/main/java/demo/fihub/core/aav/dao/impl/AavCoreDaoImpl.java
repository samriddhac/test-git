package demo.fihub.core.aav.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.fihub.core.aav.dao.AavCoreDao;

import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AavCoreDaoImpl implements AavCoreDao {

  private final DoubleToDoubleMapper doubleToDoubleMapper;
  private final SpannerTemplate spannerTemplate;

  public Double getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
