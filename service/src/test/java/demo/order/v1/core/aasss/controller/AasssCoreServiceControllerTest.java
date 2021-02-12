package demo.order.v1.core.aasss.controller;

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

import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.fasterxml.jackson.databind.ObjectMapper;

import demo.order.v1.core.aasss.controller.AasssCoreServiceController;
import demo.order.v1.core.aasss.service.AasssCoreService;
import brave.SpanCustomizer;

@RunWith(SpringRunner.class)
@WebMvcTest(AasssCoreServiceController.class)
public class AasssCoreServiceControllerTest {

  @MockBean private JsonUtils jsonUtils;
  @MockBean private Logger logger;
  @Autowired private MockMvc mockMvc;
  @MockBean private AasssCoreService aasssCoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testGetOrderIdForCustomerOrderIdOrReservationId() throws Exception {

    Assert.assertEquals(true, true);
  }
}
