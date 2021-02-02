package demo.v33.core.demo.v34.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.v33.core.demo.v34.dao.DemoV34CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.v33.core.demo.v34.service")
public class TestConfiguration {
  @MockBean public DemoV34CoreDao demoV34CoreDao;
}
