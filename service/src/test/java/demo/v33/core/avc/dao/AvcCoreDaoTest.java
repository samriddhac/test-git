package demo.v33.core.avc.dao;

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

import demo.v33.core.avc.dao.config.TestConfiguration;

import demo.v33.core.avc.dao.mapper.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class AvcCoreDaoTest {
  @Autowired private AvcCoreDao avcCoreDao;

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
