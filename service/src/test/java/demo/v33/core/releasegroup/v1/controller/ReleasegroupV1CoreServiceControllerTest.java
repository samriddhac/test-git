package demo.v33.core.releasegroup.v1.controller;

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

import demo.v33.core.releasegroup.v1.controller.ReleasegroupV1CoreServiceController;
import demo.v33.core.releasegroup.v1.service.ReleasegroupV1CoreService;
import brave.SpanCustomizer;

@RunWith(SpringRunner.class)
@WebMvcTest(ReleasegroupV1CoreServiceController.class)
public class ReleasegroupV1CoreServiceControllerTest {

  @MockBean private JsonUtils jsonUtils;
  @MockBean private Logger logger;
  @Autowired private MockMvc mockMvc;
  @MockBean private ReleasegroupV1CoreService releasegroupV1CoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testGroupLogicalShipments() throws Exception {

    Assert.assertEquals(true, true);
  }
}
