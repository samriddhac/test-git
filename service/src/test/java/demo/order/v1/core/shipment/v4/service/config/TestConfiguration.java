package demo.order.v1.core.shipment.v4.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.shipment.v4.dao.ShipmentV4CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.shipment.v4.service")
public class TestConfiguration {
  @MockBean public ShipmentV4CoreDao shipmentV4CoreDao;
}
