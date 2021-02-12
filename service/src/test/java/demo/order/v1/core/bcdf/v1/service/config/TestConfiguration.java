package demo.order.v1.core.bcdf.v1.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.bcdf.v1.dao.BcdfV1CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.bcdf.v1.service")
public class TestConfiguration {
  @MockBean public BcdfV1CoreDao bcdfV1CoreDao;
}
