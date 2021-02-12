package demo.order.v1.core.aasss.v1.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.order.v1.core.aasss.v1.dao.AasssV1CoreDao;

import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AasssV1CoreDaoImpl implements AasssV1CoreDao {

  private final SpannerTemplate spannerTemplate;

  public Double getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
