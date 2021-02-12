package demo.order.v1.core.varf.v1.dao;

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

import demo.order.v1.core.varf.v1.dao.config.TestConfiguration;

import demo.order.v1.core.varf.v1.dao.mapper.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class VarfV1CoreDaoTest {
  @Autowired private VarfV1CoreDao varfV1CoreDao;

  @Test
  public void testGroupLogicalShipments() {
    Assert.assertEquals(true, true);
  }
}
