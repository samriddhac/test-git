package demo.order.v1.core.mapper.test.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.mapper.test.dao.MapperTestCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.mapper.test.service")
public class TestConfiguration {
  @MockBean public MapperTestCoreDao mapperTestCoreDao;
}
