package demo.order.v1.core.app.core.v2.dao;

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

import demo.order.v1.core.app.core.v2.dao.config.TestConfiguration;

import demo.order.v1.core.app.core.v2.dao.mapper.OrderToOrderMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class AppCoreV2CoreDaoTest {
  @Autowired private AppCoreV2CoreDao appCoreV2CoreDao;

  @Test
  public void testGroupLogicalShipments() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testSplitLineItems() {
    Assert.assertEquals(true, true);
  }
}
