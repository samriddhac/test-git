package demo.order.v1.core.mapper.v2.service;

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

import demo.order.v1.core.mapper.v2.dao.MapperV2CoreDao;
import demo.order.v1.core.mapper.v2.service.config.TestConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class MapperV2CoreServiceTest {

  @Autowired private MapperV2CoreService mapperV2CoreService;

  @Test
  public void testGroupLogicalShipments() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testSplitLineItems() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }
}
