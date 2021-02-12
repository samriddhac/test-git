package demo.order.v1.composite.test.v2.comp;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.cache.annotation.EnableCaching;

@Configuration
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
