package demo.order.v1.core.bcdfe.v1.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.bcdfe.v1.dao.BcdfeV1CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.bcdfe.v1.service")
public class TestConfiguration {
  @MockBean public BcdfeV1CoreDao bcdfeV1CoreDao;
}
