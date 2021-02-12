package demo.fihub.core.aav.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.fihub.core.aav.dao.AavCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.fihub.core.aav.service")
public class TestConfiguration {
  @MockBean public AavCoreDao aavCoreDao;
}
