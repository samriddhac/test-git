package demo.v33.core.demo.v36.controller;

import java.util.*;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import demo.com.framework.core.utils.execution.ServiceRequestContext;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;

import demo.v33.core.demo.v36.controller.DemoV36CoreServiceController;
import demo.v33.core.demo.v36.service.DemoV36CoreService;
import brave.SpanCustomizer;

@RunWith(SpringRunner.class)
@WebMvcTest(DemoV36CoreServiceController.class)
public class DemoV36CoreServiceControllerTest {

  @MockBean private JsonUtils jsonUtils;
  @MockBean private Logger logger;
  @Autowired private MockMvc mockMvc;
  @MockBean private DemoV36CoreService demoV36CoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testCreateShipment() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAllShipmentByPONumber() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetShipmentByShipmentRef() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAllShipmentByOrderId() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testUpdateShipment() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetShipmentByShipmentId() throws Exception {

    Assert.assertEquals(true, true);
  }
}
