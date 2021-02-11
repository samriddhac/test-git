package demo.order.v1.core.order.abc.v1.service;

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

import demo.order.v1.core.order.abc.v1.service.config.TestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class OrderAbcV1CoreServiceTest {

  @Autowired private OrderAbcV1CoreService orderAbcV1CoreService;

  @Test
  public void testCreateOrder() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }
}
