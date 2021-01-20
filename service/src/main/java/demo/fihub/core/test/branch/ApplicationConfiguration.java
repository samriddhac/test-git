package demo.fihub.core.test.branch;

import org.springframework.context.annotation.Configuration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ImportResource;

@Configuration
@EntityScan(basePackages = {"demo.fihub.core.test.branch.dao.entity"})
@ImportResource("classpath:app-config.xml")
public class ApplicationConfiguration {}
