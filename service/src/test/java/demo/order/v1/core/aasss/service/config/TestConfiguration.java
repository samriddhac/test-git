package demo.order.v1.core.aasss.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.aasss.dao.AasssCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.aasss.service")
public class TestConfiguration {
  @MockBean public AasssCoreDao aasssCoreDao;
}
