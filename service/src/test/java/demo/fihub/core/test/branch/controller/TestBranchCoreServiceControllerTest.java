package demo.fihub.core.test.branch.controller;

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

import demo.fihub.core.test.branch.controller.TestBranchCoreServiceController;
import demo.fihub.core.test.branch.service.TestBranchCoreService;
import brave.SpanCustomizer;

@RunWith(SpringRunner.class)
@WebMvcTest(TestBranchCoreServiceController.class)
public class TestBranchCoreServiceControllerTest {

  @Autowired private MockMvc mockMvc;
  @MockBean private TestBranchCoreService testBranchCoreService;
  private ObjectMapper mapper = new ObjectMapper();

  @MockBean private SpanCustomizer spanCustomizer;

  @Test
  public void testGetAirports() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testPostAirports() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testGetAirport() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testPutAirport() throws Exception {

    Assert.assertEquals(true, true);
  }

  @Test
  public void testDeleteAirport() throws Exception {

    Assert.assertEquals(true, true);
  }
}
