package demo.order.v1.core.gb.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.gb.dao.GbCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.gb.service")
public class TestConfiguration {
  @MockBean public GbCoreDao gbCoreDao;
}
