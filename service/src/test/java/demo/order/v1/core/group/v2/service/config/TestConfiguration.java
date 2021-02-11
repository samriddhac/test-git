package demo.order.v1.core.group.v2.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.group.v2.dao.GroupV2CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.group.v2.service")
public class TestConfiguration {
  @MockBean public GroupV2CoreDao groupV2CoreDao;
}
