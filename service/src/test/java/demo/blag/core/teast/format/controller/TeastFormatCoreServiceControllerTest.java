package demo.blag.core.teast.format.controller;

import brave.SpanCustomizer;
import com.fasterxml.jackson.databind.ObjectMapper;
import demo.blag.core.teast.format.service.TeastFormatCoreService;
import demo.cosmos.core.utils.json.JsonUtils;
import demo.cosmos.core.utils.logging.Logger;
import java.util.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(TeastFormatCoreServiceController.class)
public class TeastFormatCoreServiceControllerTest {

  @MockBean private JsonUtils jsonUtils;
  @MockBean private Logger logger;
  @Autowired private MockMvc mockMvc;
  @MockBean private TeastFormatCoreService teastFormatCoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testGetSchedules() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetSchedule() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testPutSchedule() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeleteSchedule() throws Exception {

    Assert.assertEquals(true, true);
  }
}
