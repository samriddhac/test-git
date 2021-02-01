package demo.fihub.core.order.v1.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.cache.annotation.EnableCaching;

@Configuration
@EntityScan(basePackages = {"demo.fihub.core.order.v1.test.dao.entity"})
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
