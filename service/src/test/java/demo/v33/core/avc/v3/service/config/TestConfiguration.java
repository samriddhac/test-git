package demo.v33.core.avc.v3.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.v33.core.avc.v3.dao.AvcV3CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.v33.core.avc.v3.service")
public class TestConfiguration {
  @MockBean public AvcV3CoreDao avcV3CoreDao;
}
