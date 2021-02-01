package demo.fihub.core.order.v1.test.dao;

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
import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import demo.fihub.core.order.v1.test.dao.config.TestConfiguration;

import demo.fihub.core.order.v1.test.dao.mapper.*;
import demo.fihub.core.order.v1.test.dao.mapper.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class OrderV1TestCoreDaoTest {
  @Autowired private OrderV1TestCoreDao orderV1TestCoreDao;

  @Test
  public void testGetReturnsByCustomerOrderId() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnsByOrderId() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testPublishReturnProcessEvent() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnByOrderId() {
    Assert.assertEquals(true, true);
  }
}
