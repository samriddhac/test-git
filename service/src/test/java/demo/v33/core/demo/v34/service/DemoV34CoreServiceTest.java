package demo.v33.core.demo.v34.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import demo.v33.core.demo.v34.dao.DemoV34CoreDao;
import demo.v33.core.demo.v34.service.config.TestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class DemoV34CoreServiceTest {

  @Autowired private DemoV34CoreService demoV34CoreService;

  @Test
  public void testCreateShipment() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAllShipmentByPONumber() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetShipmentByShipmentRef() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAllShipmentByOrderId() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testUpdateShipment() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetShipmentByShipmentId() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }
}
