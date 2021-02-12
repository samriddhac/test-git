package demo.order.v1.core.varf.v1.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.varf.v1.dao.VarfV1CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.varf.v1.service")
public class TestConfiguration {
  @MockBean public VarfV1CoreDao varfV1CoreDao;
}
