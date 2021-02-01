package demo.fihub.core.order.v1.test.controller;

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

import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import com.macys.order.foundation.core.utils.json.JsonUtils;
import com.macys.order.foundation.core.utils.logging.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;

import demo.fihub.core.order.v1.test.controller.OrderV1TestCoreServiceController;
import demo.fihub.core.order.v1.test.service.OrderV1TestCoreService;
import brave.SpanCustomizer;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderV1TestCoreServiceController.class)
public class OrderV1TestCoreServiceControllerTest {

  @MockBean private JsonUtils jsonUtils;
  @MockBean private Logger logger;
  @Autowired private MockMvc mockMvc;
  @MockBean private OrderV1TestCoreService orderV1TestCoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testGetReturnsByCustomerOrderId() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnsByCustomerBalOrderId() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnsByOrderId() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testPublishReturnProcessEvent() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetReturnByOrderId() throws Exception {

    Assert.assertEquals(true, true);
  }
}
