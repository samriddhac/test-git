package demo.order.v1.core.aaaa.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.aaaa.dao.AaaaCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.aaaa.service")
public class TestConfiguration {
  @MockBean public AaaaCoreDao aaaaCoreDao;
}
