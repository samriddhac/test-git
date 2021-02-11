package demo.order.v1.core.shipment.v3;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.cache.annotation.EnableCaching;

@Configuration
@EntityScan(basePackages = {"demo.order.v1.core.shipment.v3.dao.entity"})
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
