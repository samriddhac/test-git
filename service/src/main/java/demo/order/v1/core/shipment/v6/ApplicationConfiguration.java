package demo.order.v1.core.shipment.v6;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.cache.annotation.EnableCaching;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = {"demo.order.v1.core.shipment.v6.dao.entity"})
@EnableJpaRepositories(basePackages = {"demo.order.v1.core.shipment.v6.dao.repository"})
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
