package demo.fihub.core.order.id.v7;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EntityScan(basePackages = {"demo.fihub.core.order.id.v7.dao.entity"})
@ImportResource("classpath:app-config.xml")
public class ApplicationConfiguration {}
