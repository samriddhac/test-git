package demo.v33.core.avc.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.v33.core.avc.dao.AvcCoreDao;

@Configuration
@ComponentScan(basePackages = "demo.v33.core.avc.service")
public class TestConfiguration {
  @MockBean public AvcCoreDao avcCoreDao;
}
