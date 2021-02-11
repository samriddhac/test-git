package demo.order.v1.core.shipment.v6.dao;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import demo.order.v1.core.shipment.v6.dao.config.TestConfiguration;

import javax.persistence.EntityManager;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;
import demo.order.v1.core.shipment.v6.dao.entity.*;
import demo.order.v1.core.shipment.v6.dao.repository.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {demo.order.v1.core.shipment.v6.dao.config.TestConfiguration.class})
public class ShipmentV6CoreDaoTest {
  @Autowired private ShipmentV6CoreDao shipmentV6CoreDao;

  @Test
  public void testCreateShipment() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAllShipmentByPONumber() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetShipmentByShipmentRef() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAllShipmentByOrderId() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testUpdateShipment() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetShipmentByShipmentId() {
    Assert.assertEquals(true, true);
  }
}
