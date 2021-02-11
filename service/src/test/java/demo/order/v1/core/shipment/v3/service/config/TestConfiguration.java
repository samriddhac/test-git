package demo.order.v1.core.shipment.v3.service.config;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import demo.order.v1.core.shipment.v3.dao.ShipmentV3CoreDao;

@Configuration
@ComponentScan(basePackages = "demo.order.v1.core.shipment.v3.service")
public class TestConfiguration {
  @MockBean public ShipmentV3CoreDao shipmentV3CoreDao;
}
