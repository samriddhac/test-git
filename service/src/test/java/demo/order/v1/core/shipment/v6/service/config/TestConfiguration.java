package demo.order.v1.core.shipment.v6.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.shipment.v6.dao.ShipmentV6CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.shipment.v6.service")
public class TestConfiguration {
  @MockBean public ShipmentV6CoreDao shipmentV6CoreDao;
}
