package demo.fihub.composite.air.v1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.cache.annotation.EnableCaching;

@Configuration
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
