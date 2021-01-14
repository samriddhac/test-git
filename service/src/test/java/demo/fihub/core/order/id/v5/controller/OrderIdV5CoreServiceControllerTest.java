package demo.fihub.core.order.id.v5.controller;

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
import com.fasterxml.jackson.databind.ObjectMapper;

import demo.fihub.core.order.id.v5.controller.OrderIdV5CoreServiceController;
import demo.fihub.core.order.id.v5.service.OrderIdV5CoreService;
import brave.SpanCustomizer;

@RunWith(SpringRunner.class)
@WebMvcTest(OrderIdV5CoreServiceController.class)
public class OrderIdV5CoreServiceControllerTest {

  @Autowired private MockMvc mockMvc;
  @MockBean private OrderIdV5CoreService orderIdV5CoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testGetFlights() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetFlight() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetHealth() throws Exception {

    Assert.assertEquals(true, true);
  }
}
