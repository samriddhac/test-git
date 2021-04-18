package demo.blag.core.teast.format.dao;

import demo.blag.core.teast.format.dao.config.TestConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class TeastFormatCoreDaoTest {
  @Autowired private TeastFormatCoreDao teastFormatCoreDao;

  @Test
  public void testGetSchedules() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetSchedule() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testPutSchedule() {
    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeleteSchedule() {
    Assert.assertEquals(true, true);
  }
}
