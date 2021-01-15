package demo.fihub.composite.order.collect.v3;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.cache.annotation.EnableCaching;

@Configuration
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
