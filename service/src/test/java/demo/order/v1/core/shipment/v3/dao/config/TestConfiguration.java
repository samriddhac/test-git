package demo.order.v1.core.shipment.v3.dao.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.order.v1.core.shipment.v3.dao.mapper.*;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.shipment.v3.dao")
public class TestConfiguration {

  @MockBean public OrderToOrderMapper orderToOrderMapper;

  @MockBean public ReturnOrderToReturnOrderMapper returnOrderToReturnOrderMapper;

  @MockBean public BadOrderToBadOrderMapper badOrderToBadOrderMapper;
  @MockBean public SpannerTemplate spannerTemplate;
}
