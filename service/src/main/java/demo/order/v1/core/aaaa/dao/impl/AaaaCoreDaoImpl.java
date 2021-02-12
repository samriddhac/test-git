package demo.order.v1.core.aaaa.dao.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

import demo.order.v1.core.aaaa.dao.AaaaCoreDao;

import com.google.cloud.spanner.Key;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AaaaCoreDaoImpl implements AaaaCoreDao {

  private final SpannerTemplate spannerTemplate;

  public String getOrderIdForCustomerOrderIdOrReservationId() {
    // TODO: your code goes here...
    return null;
  }
}
