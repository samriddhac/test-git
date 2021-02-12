package demo.fihub.core.aav.dao.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import demo.fihub.core.aav.dao.mapper.*;

@Configuration
@ComponentScan(basePackages = "demo.fihub.core.aav.dao")
public class TestConfiguration {

  @MockBean public DoubleToDoubleMapper doubleToDoubleMapper;
  @MockBean public SpannerTemplate spannerTemplate;
}
