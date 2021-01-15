package demo.fihub.core.order.service;

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

import demo.fihub.core.order.service.config.TestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class OrderCoreServiceTest {

  @Autowired private OrderCoreService orderCoreService;

  @Test
  public void testGetReturnsByCustomerOrderId() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnsByOrderId() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testPublishReturnProcessEvent() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnByOrderId() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }
}
