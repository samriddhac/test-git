package demo.order.v1.composite.order.collect.v33.helper;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;

import com.macys.mst.order.foundation.core.utils.execution.ServiceData;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import com.macys.mst.order.foundation.core.utils.execution.ServiceResponseContext;
import com.macys.mst.order.foundation.core.utils.logging.Logger;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractShipmentV4CoreServiceHelper
    implements IShipmentV4CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateShipmentV4CoreService;
  private final Logger loggerShipmentV4CoreService;

  @Value("${shipment-service.base_uri}")
  private String baseUriShipmentV4CoreService;

  @Value("${shipment-service.service_name}")
  private String serviceNameShipmentV4CoreService;

  @Value("${shipment-service.service_version}")
  private String serviceVersionShipmentV4CoreService;

  @Override
  @CircuitBreaker(name = "createShipment-cb", fallbackMethod = "processCreateShipmentFallback")
  @Bulkhead(name = "createShipment-bh")
  public com.abcd.uop.model.Order createShipment(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV4CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV4CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV4CoreService = null;
    ServiceData serviceDataShipmentV4CoreService = null;
    serviceRequestContextShipmentV4CoreService = processCreateShipmentRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV4CoreService);
    serviceRequestContextShipmentV4CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV4CoreService + "/op/v1/order/shipment/create"))
            .queryParams(serviceRequestContextShipmentV4CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV4CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV4CoreService.setMethod(HttpMethod.POST.name());
    if (serviceCallId != null) {
      serviceDataShipmentV4CoreService = new ServiceData();
      serviceDataShipmentV4CoreService.setName(serviceNameShipmentV4CoreService);
      serviceDataShipmentV4CoreService.setVersion(serviceVersionShipmentV4CoreService);
      serviceDataShipmentV4CoreService.setOperation(HttpMethod.POST.toString());
      serviceDataShipmentV4CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV4CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV4CoreService);
    }
    loggerShipmentV4CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextShipmentV4CoreService.getEventType(),
        serviceRequestContextShipmentV4CoreService.getEventMessage(),
        serviceRequestContextShipmentV4CoreService.getBody());

    responseEntityShipmentV4CoreService =
        restTemplateShipmentV4CoreService.exchange(
            serviceRequestContextShipmentV4CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextShipmentV4CoreService.getBody(),
                serviceRequestContextShipmentV4CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV4CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityShipmentV4CoreService.getStatusCode().value()),
        responseEntityShipmentV4CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV4CoreService.getEventType(),
        serviceRequestContextShipmentV4CoreService.getEventMessage(),
        responseEntityShipmentV4CoreService.getBody());
    serviceResponseContextShipmentV4CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV4CoreService.setBody(
        responseEntityShipmentV4CoreService.getBody());
    serviceResponseContextShipmentV4CoreService.setHeaders(
        responseEntityShipmentV4CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV4CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV4CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV4CoreService);
    }
    return processCreateShipmentResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(name = "updateShipment-cb", fallbackMethod = "processUpdateShipmentFallback")
  @Bulkhead(name = "updateShipment-bh")
  public com.abcd.uop.model.Order updateShipment(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV4CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV4CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV4CoreService = null;
    ServiceData serviceDataShipmentV4CoreService = null;
    serviceRequestContextShipmentV4CoreService = processUpdateShipmentRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV4CoreService);
    serviceRequestContextShipmentV4CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV4CoreService + "/op/v1/order/shipment/update"))
            .queryParams(serviceRequestContextShipmentV4CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV4CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV4CoreService.setMethod(HttpMethod.PUT.name());
    if (serviceCallId != null) {
      serviceDataShipmentV4CoreService = new ServiceData();
      serviceDataShipmentV4CoreService.setName(serviceNameShipmentV4CoreService);
      serviceDataShipmentV4CoreService.setVersion(serviceVersionShipmentV4CoreService);
      serviceDataShipmentV4CoreService.setOperation(HttpMethod.PUT.toString());
      serviceDataShipmentV4CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV4CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV4CoreService);
    }
    loggerShipmentV4CoreService.logRestClientRequest(
        HttpMethod.PUT.name(),
        serviceRequestContextShipmentV4CoreService.getEventType(),
        serviceRequestContextShipmentV4CoreService.getEventMessage(),
        serviceRequestContextShipmentV4CoreService.getBody());

    responseEntityShipmentV4CoreService =
        restTemplateShipmentV4CoreService.exchange(
            serviceRequestContextShipmentV4CoreService.getUrl(),
            HttpMethod.PUT,
            new HttpEntity<>(
                serviceRequestContextShipmentV4CoreService.getBody(),
                serviceRequestContextShipmentV4CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV4CoreService.logRestClientResponse(
        HttpMethod.PUT.name(),
        String.valueOf(responseEntityShipmentV4CoreService.getStatusCode().value()),
        responseEntityShipmentV4CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV4CoreService.getEventType(),
        serviceRequestContextShipmentV4CoreService.getEventMessage(),
        responseEntityShipmentV4CoreService.getBody());
    serviceResponseContextShipmentV4CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV4CoreService.setBody(
        responseEntityShipmentV4CoreService.getBody());
    serviceResponseContextShipmentV4CoreService.setHeaders(
        responseEntityShipmentV4CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV4CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV4CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV4CoreService);
    }
    return processUpdateShipmentResponse(serviceCallId);
  }
}
