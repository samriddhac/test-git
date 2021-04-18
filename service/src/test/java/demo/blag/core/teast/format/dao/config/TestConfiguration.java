package demo.blag.core.teast.format.dao.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo.blag.core.teast.format.dao")
public class TestConfiguration {

  @MockBean public SpannerTemplate spannerTemplate;
}
