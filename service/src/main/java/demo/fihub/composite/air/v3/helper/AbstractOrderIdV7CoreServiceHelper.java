package demo.fihub.composite.air.v3.helper;

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
import demo.fihub.core.order.id.v7.model.*;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractOrderIdV7CoreServiceHelper
    implements IOrderIdV7CoreServiceHelper, ServiceExceutionContextUtil {

  private final RestTemplate restTemplateOrderIdV7CoreService;
  private final Logger loggerOrderIdV7CoreService;

  @Value("${returnsaggregator-service.base_uri}")
  private String baseUriOrderIdV7CoreService;

  @Value("${returnsaggregator-service.service_name}")
  private String serviceNameOrderIdV7CoreService;

  @Value("${returnsaggregator-service.service_version}")
  private String serviceVersionOrderIdV7CoreService;

  @Override
  @CircuitBreaker(
      name = "getReturnsByCustomerOrderId-cb",
      fallbackMethod = "processGetReturnsByCustomerOrderIdFallback")
  @Bulkhead(name = "getReturnsByCustomerOrderId-bh")
  public List<Order> getReturnsByCustomerOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextOrderIdV7CoreService = null;
    ServiceResponseContext serviceResponseContextOrderIdV7CoreService = null;
    ResponseEntity<Order[]> responseEntityOrderIdV7CoreService = null;
    ServiceData serviceDataOrderIdV7CoreService = null;
    serviceRequestContextOrderIdV7CoreService =
        processGetReturnsByCustomerOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextOrderIdV7CoreService);
    serviceRequestContextOrderIdV7CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriOrderIdV7CoreService + "/customerorderdetails/{customerOrderId}"))
            .queryParams(serviceRequestContextOrderIdV7CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextOrderIdV7CoreService.getPathParams())
            .toUriString());
    serviceRequestContextOrderIdV7CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataOrderIdV7CoreService = new ServiceData();
      serviceDataOrderIdV7CoreService.setName(serviceNameOrderIdV7CoreService);
      serviceDataOrderIdV7CoreService.setVersion(serviceVersionOrderIdV7CoreService);
      serviceDataOrderIdV7CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataOrderIdV7CoreService.setServiceRequestContext(
          serviceRequestContextOrderIdV7CoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderIdV7CoreService);
    }
    loggerOrderIdV7CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextOrderIdV7CoreService.getEventType(),
        serviceRequestContextOrderIdV7CoreService.getEventMessage(),
        null);

    responseEntityOrderIdV7CoreService =
        restTemplateOrderIdV7CoreService.exchange(
            serviceRequestContextOrderIdV7CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextOrderIdV7CoreService.getHeaders()),
            Order[].class);

    loggerOrderIdV7CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityOrderIdV7CoreService.getStatusCode().value()),
        responseEntityOrderIdV7CoreService.getStatusCode().name(),
        serviceRequestContextOrderIdV7CoreService.getEventType(),
        serviceRequestContextOrderIdV7CoreService.getEventMessage(),
        responseEntityOrderIdV7CoreService.getBody());
    serviceResponseContextOrderIdV7CoreService = new ServiceResponseContext();
    serviceResponseContextOrderIdV7CoreService.setBody(
        responseEntityOrderIdV7CoreService.getBody());
    serviceResponseContextOrderIdV7CoreService.setHeaders(
        responseEntityOrderIdV7CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataOrderIdV7CoreService.setServiceResponseContext(
          serviceResponseContextOrderIdV7CoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderIdV7CoreService);
    }
    return processGetReturnsByCustomerOrderIdResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "publishReturnProcessEvent-cb",
      fallbackMethod = "processPublishReturnProcessEventFallback")
  @Bulkhead(name = "publishReturnProcessEvent-bh")
  public Order publishReturnProcessEvent(String serviceCallId) {
    ServiceRequestContext serviceRequestContextOrderIdV7CoreService = null;
    ServiceResponseContext serviceResponseContextOrderIdV7CoreService = null;
    ResponseEntity<Order> responseEntityOrderIdV7CoreService = null;
    ServiceData serviceDataOrderIdV7CoreService = null;
    serviceRequestContextOrderIdV7CoreService =
        processPublishReturnProcessEventRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextOrderIdV7CoreService);
    serviceRequestContextOrderIdV7CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriOrderIdV7CoreService + "/Order/remorsetask/invoke"))
            .queryParams(serviceRequestContextOrderIdV7CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextOrderIdV7CoreService.getPathParams())
            .toUriString());
    serviceRequestContextOrderIdV7CoreService.setMethod(HttpMethod.POST.name());
    if (serviceCallId != null) {
      serviceDataOrderIdV7CoreService = new ServiceData();
      serviceDataOrderIdV7CoreService.setName(serviceNameOrderIdV7CoreService);
      serviceDataOrderIdV7CoreService.setVersion(serviceVersionOrderIdV7CoreService);
      serviceDataOrderIdV7CoreService.setOperation(HttpMethod.POST.toString());
      serviceDataOrderIdV7CoreService.setServiceRequestContext(
          serviceRequestContextOrderIdV7CoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderIdV7CoreService);
    }
    loggerOrderIdV7CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextOrderIdV7CoreService.getEventType(),
        serviceRequestContextOrderIdV7CoreService.getEventMessage(),
        serviceRequestContextOrderIdV7CoreService.getBody());

    responseEntityOrderIdV7CoreService =
        restTemplateOrderIdV7CoreService.exchange(
            serviceRequestContextOrderIdV7CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextOrderIdV7CoreService.getBody(),
                serviceRequestContextOrderIdV7CoreService.getHeaders()),
            Order.class);

    loggerOrderIdV7CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityOrderIdV7CoreService.getStatusCode().value()),
        responseEntityOrderIdV7CoreService.getStatusCode().name(),
        serviceRequestContextOrderIdV7CoreService.getEventType(),
        serviceRequestContextOrderIdV7CoreService.getEventMessage(),
        responseEntityOrderIdV7CoreService.getBody());
    serviceResponseContextOrderIdV7CoreService = new ServiceResponseContext();
    serviceResponseContextOrderIdV7CoreService.setBody(
        responseEntityOrderIdV7CoreService.getBody());
    serviceResponseContextOrderIdV7CoreService.setHeaders(
        responseEntityOrderIdV7CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataOrderIdV7CoreService.setServiceResponseContext(
          serviceResponseContextOrderIdV7CoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderIdV7CoreService);
    }
    return processPublishReturnProcessEventResponse(serviceCallId);
  }
}
