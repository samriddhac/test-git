package demo.fihub.core.blah.test.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "demo.fihub.core.blah.test.service")
public class TestConfiguration {}
