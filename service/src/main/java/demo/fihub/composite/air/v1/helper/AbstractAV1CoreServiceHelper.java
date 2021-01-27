package demo.fihub.composite.air.v1.helper;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;

import com.macys.order.foundation.core.utils.execution.ServiceData;
import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import com.macys.order.foundation.core.utils.execution.ServiceResponseContext;
import com.macys.order.foundation.core.utils.logging.Logger;
import demo.fihub.core.a.v1.model.*;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractAV1CoreServiceHelper
    implements IAV1CoreServiceHelper, ServiceExceutionContextUtil {

  private final RestTemplate restTemplateAV1CoreService;
  private final Logger loggerAV1CoreService;

  @Value("${returnsaggregator-service.base_uri}")
  private String baseUriAV1CoreService;

  @Value("${returnsaggregator-service.service_name}")
  private String serviceNameAV1CoreService;

  @Value("${returnsaggregator-service.service_version}")
  private String serviceVersionAV1CoreService;

  @Override
  @CircuitBreaker(
      name = "getReturnsByCustomerOrderId-cb",
      fallbackMethod = "processGetReturnsByCustomerOrderIdFallback")
  @Bulkhead(name = "getReturnsByCustomerOrderId-bh")
  public List<Order> getReturnsByCustomerOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextAV1CoreService = null;
    ServiceResponseContext serviceResponseContextAV1CoreService = null;
    ResponseEntity<Order[]> responseEntityAV1CoreService = null;
    ServiceData serviceDataAV1CoreService = null;
    serviceRequestContextAV1CoreService = processGetReturnsByCustomerOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextAV1CoreService);
    serviceRequestContextAV1CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriAV1CoreService + "/customerorderdetails/{customerOrderId}"))
            .queryParams(serviceRequestContextAV1CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextAV1CoreService.getPathParams())
            .toUriString());
    serviceRequestContextAV1CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataAV1CoreService = new ServiceData();
      serviceDataAV1CoreService.setName(serviceNameAV1CoreService);
      serviceDataAV1CoreService.setVersion(serviceVersionAV1CoreService);
      serviceDataAV1CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataAV1CoreService.setServiceRequestContext(serviceRequestContextAV1CoreService);
      setServiceCallResult(serviceCallId, serviceDataAV1CoreService);
    }
    loggerAV1CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextAV1CoreService.getEventType(),
        serviceRequestContextAV1CoreService.getEventMessage(),
        null);

    responseEntityAV1CoreService =
        restTemplateAV1CoreService.exchange(
            serviceRequestContextAV1CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextAV1CoreService.getHeaders()),
            Order[].class);

    loggerAV1CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityAV1CoreService.getStatusCode().value()),
        responseEntityAV1CoreService.getStatusCode().name(),
        serviceRequestContextAV1CoreService.getEventType(),
        serviceRequestContextAV1CoreService.getEventMessage(),
        responseEntityAV1CoreService.getBody());
    serviceResponseContextAV1CoreService = new ServiceResponseContext();
    serviceResponseContextAV1CoreService.setBody(responseEntityAV1CoreService.getBody());
    serviceResponseContextAV1CoreService.setHeaders(responseEntityAV1CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataAV1CoreService.setServiceResponseContext(serviceResponseContextAV1CoreService);
      setServiceCallResult(serviceCallId, serviceDataAV1CoreService);
    }
    return processGetReturnsByCustomerOrderIdResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "publishReturnProcessEvent-cb",
      fallbackMethod = "processPublishReturnProcessEventFallback")
  @Bulkhead(name = "publishReturnProcessEvent-bh")
  public Order publishReturnProcessEvent(String serviceCallId) {
    ServiceRequestContext serviceRequestContextAV1CoreService = null;
    ServiceResponseContext serviceResponseContextAV1CoreService = null;
    ResponseEntity<Order> responseEntityAV1CoreService = null;
    ServiceData serviceDataAV1CoreService = null;
    serviceRequestContextAV1CoreService = processPublishReturnProcessEventRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextAV1CoreService);
    serviceRequestContextAV1CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl((baseUriAV1CoreService + "/Order/remorsetask/invoke"))
            .queryParams(serviceRequestContextAV1CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextAV1CoreService.getPathParams())
            .toUriString());
    serviceRequestContextAV1CoreService.setMethod(HttpMethod.POST.name());
    if (serviceCallId != null) {
      serviceDataAV1CoreService = new ServiceData();
      serviceDataAV1CoreService.setName(serviceNameAV1CoreService);
      serviceDataAV1CoreService.setVersion(serviceVersionAV1CoreService);
      serviceDataAV1CoreService.setOperation(HttpMethod.POST.toString());
      serviceDataAV1CoreService.setServiceRequestContext(serviceRequestContextAV1CoreService);
      setServiceCallResult(serviceCallId, serviceDataAV1CoreService);
    }
    loggerAV1CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextAV1CoreService.getEventType(),
        serviceRequestContextAV1CoreService.getEventMessage(),
        serviceRequestContextAV1CoreService.getBody());

    responseEntityAV1CoreService =
        restTemplateAV1CoreService.exchange(
            serviceRequestContextAV1CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextAV1CoreService.getBody(),
                serviceRequestContextAV1CoreService.getHeaders()),
            Order.class);

    loggerAV1CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityAV1CoreService.getStatusCode().value()),
        responseEntityAV1CoreService.getStatusCode().name(),
        serviceRequestContextAV1CoreService.getEventType(),
        serviceRequestContextAV1CoreService.getEventMessage(),
        responseEntityAV1CoreService.getBody());
    serviceResponseContextAV1CoreService = new ServiceResponseContext();
    serviceResponseContextAV1CoreService.setBody(responseEntityAV1CoreService.getBody());
    serviceResponseContextAV1CoreService.setHeaders(responseEntityAV1CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataAV1CoreService.setServiceResponseContext(serviceResponseContextAV1CoreService);
      setServiceCallResult(serviceCallId, serviceDataAV1CoreService);
    }
    return processPublishReturnProcessEventResponse(serviceCallId);
  }
}
