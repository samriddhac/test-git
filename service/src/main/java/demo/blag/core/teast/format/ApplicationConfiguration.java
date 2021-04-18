package demo.blag.core.teast.format;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EntityScan(basePackages = {"demo.blag.core.teast.format.dao.entity"})
@ImportResource("classpath:app-config.xml")
@EnableCaching
public class ApplicationConfiguration {}
