package demo.order.v1.core.bcdf.v1.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.order.v1.core.bcdf.v1.dao.BcdfV1CoreDao;

import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BcdfV1CoreDaoImpl implements BcdfV1CoreDao {

  private final SpannerTemplate spannerTemplate;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
