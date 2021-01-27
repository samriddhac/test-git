package demo.fihub.composite.air.v4.helper;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;

import com.macys.order.foundation.core.utils.execution.ServiceData;
import com.macys.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.order.foundation.core.utils.execution.ServiceRequestContext;
import com.macys.order.foundation.core.utils.execution.ServiceResponseContext;
import com.macys.order.foundation.core.utils.logging.Logger;
import demo.fihub.core.order.id.v6.model.*;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractOrderIdV6CoreServiceHelper
    implements IOrderIdV6CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateOrderIdV6CoreService;
  private final Logger loggerOrderIdV6CoreService;

  @Value("${returnsaggregator-service.base_uri}")
  private String baseUriOrderIdV6CoreService;

  @Value("${returnsaggregator-service.service_name}")
  private String serviceNameOrderIdV6CoreService;

  @Value("${returnsaggregator-service.service_version}")
  private String serviceVersionOrderIdV6CoreService;

  @Override
  @CircuitBreaker(
      name = "getReturnsByCustomerOrderId-cb",
      fallbackMethod = "processGetReturnsByCustomerOrderIdFallback")
  @Bulkhead(name = "getReturnsByCustomerOrderId-bh")
  public List<Order> getReturnsByCustomerOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextOrderIdV6CoreService = null;
    ServiceResponseContext serviceResponseContextOrderIdV6CoreService = null;
    ResponseEntity<Order[]> responseEntityOrderIdV6CoreService = null;
    ServiceData serviceDataOrderIdV6CoreService = null;
    serviceRequestContextOrderIdV6CoreService =
        processGetReturnsByCustomerOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextOrderIdV6CoreService);
    serviceRequestContextOrderIdV6CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriOrderIdV6CoreService + "/customerorderdetails/{customerOrderId}"))
            .queryParams(serviceRequestContextOrderIdV6CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextOrderIdV6CoreService.getPathParams())
            .toUriString());
    serviceRequestContextOrderIdV6CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataOrderIdV6CoreService = new ServiceData();
      serviceDataOrderIdV6CoreService.setName(serviceNameOrderIdV6CoreService);
      serviceDataOrderIdV6CoreService.setVersion(serviceVersionOrderIdV6CoreService);
      serviceDataOrderIdV6CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataOrderIdV6CoreService.setServiceRequestContext(
          serviceRequestContextOrderIdV6CoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderIdV6CoreService);
    }
    loggerOrderIdV6CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextOrderIdV6CoreService.getEventType(),
        serviceRequestContextOrderIdV6CoreService.getEventMessage(),
        null);

    responseEntityOrderIdV6CoreService =
        restTemplateOrderIdV6CoreService.exchange(
            serviceRequestContextOrderIdV6CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextOrderIdV6CoreService.getHeaders()),
            Order[].class);

    loggerOrderIdV6CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityOrderIdV6CoreService.getStatusCode().value()),
        responseEntityOrderIdV6CoreService.getStatusCode().name(),
        serviceRequestContextOrderIdV6CoreService.getEventType(),
        serviceRequestContextOrderIdV6CoreService.getEventMessage(),
        responseEntityOrderIdV6CoreService.getBody());
    serviceResponseContextOrderIdV6CoreService = new ServiceResponseContext();
    serviceResponseContextOrderIdV6CoreService.setBody(
        responseEntityOrderIdV6CoreService.getBody());
    serviceResponseContextOrderIdV6CoreService.setHeaders(
        responseEntityOrderIdV6CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataOrderIdV6CoreService.setServiceResponseContext(
          serviceResponseContextOrderIdV6CoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderIdV6CoreService);
    }
    return processGetReturnsByCustomerOrderIdResponse(serviceCallId);
  }
}
