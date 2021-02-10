package demo.v33.core.releasegroup.v1.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.v33.core.releasegroup.v1.dao.ReleasegroupV1CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.v33.core.releasegroup.v1.service")
public class TestConfiguration {
  @MockBean public ReleasegroupV1CoreDao releasegroupV1CoreDao;
}
