package demo.v33.core.avc.v5.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.v33.core.avc.v5.dao.AvcV5CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.v33.core.avc.v5.service")
public class TestConfiguration {
  @MockBean public AvcV5CoreDao avcV5CoreDao;
}
