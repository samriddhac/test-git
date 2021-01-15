package demo.fihub.composite.order.collect.helper;

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
import demo.fihub.core.order.model.*;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractOrderCoreServiceHelper
    implements IOrderCoreServiceHelper, ServiceExceutionContextUtil {

  private final RestTemplate restTemplateOrderCoreService;

  @Value("${returnsaggregator-service.base_uri}")
  private String baseUriOrderCoreService;

  @Value("${returnsaggregator-service.service_name}")
  private String serviceNameOrderCoreService;

  @Value("${returnsaggregator-service.service_version}")
  private String serviceVersionOrderCoreService;

  @Override
  @CircuitBreaker(
      name = "getReturnsByCustomerOrderId-cb",
      fallbackMethod = "processGetReturnsByCustomerOrderIdFallback")
  @Bulkhead(name = "getReturnsByCustomerOrderId-bh")
  public List<Order> getReturnsByCustomerOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextOrderCoreService = null;
    ServiceResponseContext serviceResponseContextOrderCoreService = null;
    ResponseEntity<Order[]> responseEntityOrderCoreService = null;
    ServiceData serviceDataOrderCoreService = null;
    serviceRequestContextOrderCoreService =
        processGetReturnsByCustomerOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextOrderCoreService);
    serviceRequestContextOrderCoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriOrderCoreService + "/customerorderdetails/{customerOrderId}"))
            .queryParams(serviceRequestContextOrderCoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextOrderCoreService.getPathParams())
            .toUriString());
    serviceRequestContextOrderCoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataOrderCoreService = new ServiceData();
      serviceDataOrderCoreService.setName(serviceNameOrderCoreService);
      serviceDataOrderCoreService.setVersion(serviceVersionOrderCoreService);
      serviceDataOrderCoreService.setOperation(HttpMethod.GET.toString());
      serviceDataOrderCoreService.setServiceRequestContext(serviceRequestContextOrderCoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderCoreService);
    }
    responseEntityOrderCoreService =
        restTemplateOrderCoreService.exchange(
            serviceRequestContextOrderCoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextOrderCoreService.getHeaders()),
            Order[].class);
    serviceResponseContextOrderCoreService = new ServiceResponseContext();
    serviceResponseContextOrderCoreService.setBody(responseEntityOrderCoreService.getBody());
    serviceResponseContextOrderCoreService.setHeaders(responseEntityOrderCoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataOrderCoreService.setServiceResponseContext(serviceResponseContextOrderCoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderCoreService);
    }
    return processGetReturnsByCustomerOrderIdResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getReturnsByOrderId-cb",
      fallbackMethod = "processGetReturnsByOrderIdFallback")
  @Bulkhead(name = "getReturnsByOrderId-bh")
  public List<OrderTransactions> getReturnsByOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextOrderCoreService = null;
    ServiceResponseContext serviceResponseContextOrderCoreService = null;
    ResponseEntity<OrderTransactions[]> responseEntityOrderCoreService = null;
    ServiceData serviceDataOrderCoreService = null;
    serviceRequestContextOrderCoreService = processGetReturnsByOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextOrderCoreService);
    serviceRequestContextOrderCoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl((baseUriOrderCoreService + "/returndetails/{orderId}"))
            .queryParams(serviceRequestContextOrderCoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextOrderCoreService.getPathParams())
            .toUriString());
    serviceRequestContextOrderCoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataOrderCoreService = new ServiceData();
      serviceDataOrderCoreService.setName(serviceNameOrderCoreService);
      serviceDataOrderCoreService.setVersion(serviceVersionOrderCoreService);
      serviceDataOrderCoreService.setOperation(HttpMethod.GET.toString());
      serviceDataOrderCoreService.setServiceRequestContext(serviceRequestContextOrderCoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderCoreService);
    }
    responseEntityOrderCoreService =
        restTemplateOrderCoreService.exchange(
            serviceRequestContextOrderCoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextOrderCoreService.getHeaders()),
            OrderTransactions[].class);
    serviceResponseContextOrderCoreService = new ServiceResponseContext();
    serviceResponseContextOrderCoreService.setBody(responseEntityOrderCoreService.getBody());
    serviceResponseContextOrderCoreService.setHeaders(responseEntityOrderCoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataOrderCoreService.setServiceResponseContext(serviceResponseContextOrderCoreService);
      setServiceCallResult(serviceCallId, serviceDataOrderCoreService);
    }
    return processGetReturnsByOrderIdResponse(serviceCallId);
  }
}
