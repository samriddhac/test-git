package demo.fihub.core.order.v1.test.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.fihub.core.order.v1.test.dao.OrderV1TestCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.fihub.core.order.v1.test.service")
public class TestConfiguration {
  @MockBean public OrderV1TestCoreDao orderV1TestCoreDao;
}
