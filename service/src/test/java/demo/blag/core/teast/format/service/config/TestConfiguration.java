package demo.blag.core.teast.format.service.config;

import demo.blag.core.teast.format.dao.TeastFormatCoreDao;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo.blag.core.teast.format.service")
public class TestConfiguration {
  @MockBean public TeastFormatCoreDao teastFormatCoreDao;
}
