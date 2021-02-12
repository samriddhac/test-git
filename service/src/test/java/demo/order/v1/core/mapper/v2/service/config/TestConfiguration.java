package demo.order.v1.core.mapper.v2.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.mapper.v2.dao.MapperV2CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.mapper.v2.service")
public class TestConfiguration {
  @MockBean public MapperV2CoreDao mapperV2CoreDao;
}
