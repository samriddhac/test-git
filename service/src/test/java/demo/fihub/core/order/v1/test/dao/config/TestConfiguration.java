package demo.fihub.core.order.v1.test.dao.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.fihub.core.order.v1.test.dao.mapper.*;
import demo.fihub.core.order.v1.test.dao.mapper.*;

@Configuration
@ComponentScan(basePackages = "demo.fihub.core.order.v1.test.dao")
public class TestConfiguration {

  @MockBean public OrderToOrderMapper orderToOrderMapper;

  @MockBean
  public OrderTransactionsToOrderTransactionsMapper orderTransactionsToOrderTransactionsMapper;

  @MockBean public SpannerTemplate spannerTemplate;
}
