package demo.blag.core.teast.format.service;

import demo.blag.core.teast.format.service.config.TestConfiguration;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestConfiguration.class)
public class TeastFormatCoreServiceTest {

  @Autowired private TeastFormatCoreService teastFormatCoreService;

  @Test
  public void testGetSchedules() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetSchedule() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testPutSchedule() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeleteSchedule() {
    // TODO: your code goes here...
    Assert.assertEquals(true, true);
  }
}
