package demo.v33.composite.shipment.comp.v1.helper;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;

import demo.com.framework.core.utils.execution.ServiceData;
import demo.com.framework.core.utils.execution.ServiceExecutionContextUtil;
import demo.com.framework.core.utils.execution.ServiceRequestContext;
import demo.com.framework.core.utils.execution.ServiceResponseContext;
import demo.com.framework.core.utils.logging.Logger;
import com.abcd.uop.model.BadOrder;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractShipmentV5CoreServiceHelper
    implements IShipmentV5CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateShipmentV5CoreService;
  private final Logger loggerShipmentV5CoreService;

  @Value("${shipment-service.base_uri}")
  private String baseUriShipmentV5CoreService;

  @Value("${shipment-service.service_name}")
  private String serviceNameShipmentV5CoreService;

  @Value("${shipment-service.service_version}")
  private String serviceVersionShipmentV5CoreService;

  @Override
  @CircuitBreaker(name = "createShipment-cb", fallbackMethod = "processCreateShipmentFallback")
  @Bulkhead(name = "createShipment-bh")
  public com.abcd.uop.model.Order createShipment(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV5CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV5CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV5CoreService = null;
    ServiceData serviceDataShipmentV5CoreService = null;
    serviceRequestContextShipmentV5CoreService = processCreateShipmentRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV5CoreService);
    serviceRequestContextShipmentV5CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV5CoreService + "/op/v1/order/shipment/create"))
            .queryParams(serviceRequestContextShipmentV5CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV5CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV5CoreService.setMethod(HttpMethod.POST.name());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService = new ServiceData();
      serviceDataShipmentV5CoreService.setName(serviceNameShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setVersion(serviceVersionShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setOperation(HttpMethod.POST.toString());
      serviceDataShipmentV5CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    loggerShipmentV5CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        serviceRequestContextShipmentV5CoreService.getBody());

    responseEntityShipmentV5CoreService =
        restTemplateShipmentV5CoreService.exchange(
            serviceRequestContextShipmentV5CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextShipmentV5CoreService.getBody(),
                serviceRequestContextShipmentV5CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV5CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityShipmentV5CoreService.getStatusCode().value()),
        responseEntityShipmentV5CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV5CoreService.setBody(
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService.setHeaders(
        responseEntityShipmentV5CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    return processCreateShipmentResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(name = "updateShipment-cb", fallbackMethod = "processUpdateShipmentFallback")
  @Bulkhead(name = "updateShipment-bh")
  public com.abcd.uop.model.Order updateShipment(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV5CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV5CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV5CoreService = null;
    ServiceData serviceDataShipmentV5CoreService = null;
    serviceRequestContextShipmentV5CoreService = processUpdateShipmentRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV5CoreService);
    serviceRequestContextShipmentV5CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV5CoreService + "/op/v1/order/shipment/update"))
            .queryParams(serviceRequestContextShipmentV5CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV5CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV5CoreService.setMethod(HttpMethod.PUT.name());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService = new ServiceData();
      serviceDataShipmentV5CoreService.setName(serviceNameShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setVersion(serviceVersionShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setOperation(HttpMethod.PUT.toString());
      serviceDataShipmentV5CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    loggerShipmentV5CoreService.logRestClientRequest(
        HttpMethod.PUT.name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        serviceRequestContextShipmentV5CoreService.getBody());

    responseEntityShipmentV5CoreService =
        restTemplateShipmentV5CoreService.exchange(
            serviceRequestContextShipmentV5CoreService.getUrl(),
            HttpMethod.PUT,
            new HttpEntity<>(
                serviceRequestContextShipmentV5CoreService.getBody(),
                serviceRequestContextShipmentV5CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV5CoreService.logRestClientResponse(
        HttpMethod.PUT.name(),
        String.valueOf(responseEntityShipmentV5CoreService.getStatusCode().value()),
        responseEntityShipmentV5CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV5CoreService.setBody(
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService.setHeaders(
        responseEntityShipmentV5CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    return processUpdateShipmentResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getShipmentByShipmentId-cb",
      fallbackMethod = "processGetShipmentByShipmentIdFallback")
  @Bulkhead(name = "getShipmentByShipmentId-bh")
  public BadOrder getShipmentByShipmentId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV5CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV5CoreService = null;
    ResponseEntity<BadOrder> responseEntityShipmentV5CoreService = null;
    ServiceData serviceDataShipmentV5CoreService = null;
    serviceRequestContextShipmentV5CoreService =
        processGetShipmentByShipmentIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV5CoreService);
    serviceRequestContextShipmentV5CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV5CoreService
                    + "/op/v1/order/shipment/{shipmentorderid}/{shipmentid} "))
            .queryParams(serviceRequestContextShipmentV5CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV5CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV5CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService = new ServiceData();
      serviceDataShipmentV5CoreService.setName(serviceNameShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setVersion(serviceVersionShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV5CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    loggerShipmentV5CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        null);

    responseEntityShipmentV5CoreService =
        restTemplateShipmentV5CoreService.exchange(
            serviceRequestContextShipmentV5CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV5CoreService.getHeaders()),
            BadOrder.class);

    loggerShipmentV5CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV5CoreService.getStatusCode().value()),
        responseEntityShipmentV5CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV5CoreService.setBody(
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService.setHeaders(
        responseEntityShipmentV5CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    return processGetShipmentByShipmentIdResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getAllShipmentByPoNumber-cb",
      fallbackMethod = "processGetAllShipmentByPoNumberFallback")
  @Bulkhead(name = "getAllShipmentByPoNumber-bh")
  public com.abcd.uop.returning.model.Order getAllShipmentByPoNumber(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV5CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV5CoreService = null;
    ResponseEntity<com.abcd.uop.returning.model.Order> responseEntityShipmentV5CoreService = null;
    ServiceData serviceDataShipmentV5CoreService = null;
    serviceRequestContextShipmentV5CoreService =
        processGetAllShipmentByPoNumberRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV5CoreService);
    serviceRequestContextShipmentV5CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV5CoreService + "/op/v1/order/shipments/ponumber/{ponumber} "))
            .queryParams(serviceRequestContextShipmentV5CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV5CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV5CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService = new ServiceData();
      serviceDataShipmentV5CoreService.setName(serviceNameShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setVersion(serviceVersionShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV5CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    loggerShipmentV5CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        null);

    responseEntityShipmentV5CoreService =
        restTemplateShipmentV5CoreService.exchange(
            serviceRequestContextShipmentV5CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV5CoreService.getHeaders()),
            com.abcd.uop.returning.model.Order.class);

    loggerShipmentV5CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV5CoreService.getStatusCode().value()),
        responseEntityShipmentV5CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV5CoreService.setBody(
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService.setHeaders(
        responseEntityShipmentV5CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    return processGetAllShipmentByPoNumberResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getShipmentByShipmentRef-cb",
      fallbackMethod = "processGetShipmentByShipmentRefFallback")
  @Bulkhead(name = "getShipmentByShipmentRef-bh")
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV5CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV5CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV5CoreService = null;
    ServiceData serviceDataShipmentV5CoreService = null;
    serviceRequestContextShipmentV5CoreService =
        processGetShipmentByShipmentRefRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV5CoreService);
    serviceRequestContextShipmentV5CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV5CoreService
                    + "/op/v1/order/shipments/shipmentref/{shipmentref} "))
            .queryParams(serviceRequestContextShipmentV5CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV5CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV5CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService = new ServiceData();
      serviceDataShipmentV5CoreService.setName(serviceNameShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setVersion(serviceVersionShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV5CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    loggerShipmentV5CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        null);

    responseEntityShipmentV5CoreService =
        restTemplateShipmentV5CoreService.exchange(
            serviceRequestContextShipmentV5CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV5CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV5CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV5CoreService.getStatusCode().value()),
        responseEntityShipmentV5CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV5CoreService.setBody(
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService.setHeaders(
        responseEntityShipmentV5CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    return processGetShipmentByShipmentRefResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getAllShipmentByOrderId-cb",
      fallbackMethod = "processGetAllShipmentByOrderIdFallback")
  @Bulkhead(name = "getAllShipmentByOrderId-bh")
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV5CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV5CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV5CoreService = null;
    ServiceData serviceDataShipmentV5CoreService = null;
    serviceRequestContextShipmentV5CoreService =
        processGetAllShipmentByOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV5CoreService);
    serviceRequestContextShipmentV5CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV5CoreService + "/op/v1/order/shipments/{shipmentorderid} "))
            .queryParams(serviceRequestContextShipmentV5CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV5CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV5CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService = new ServiceData();
      serviceDataShipmentV5CoreService.setName(serviceNameShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setVersion(serviceVersionShipmentV5CoreService);
      serviceDataShipmentV5CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV5CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    loggerShipmentV5CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        null);

    responseEntityShipmentV5CoreService =
        restTemplateShipmentV5CoreService.exchange(
            serviceRequestContextShipmentV5CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV5CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV5CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV5CoreService.getStatusCode().value()),
        responseEntityShipmentV5CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV5CoreService.getEventType(),
        serviceRequestContextShipmentV5CoreService.getEventMessage(),
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV5CoreService.setBody(
        responseEntityShipmentV5CoreService.getBody());
    serviceResponseContextShipmentV5CoreService.setHeaders(
        responseEntityShipmentV5CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV5CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV5CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV5CoreService);
    }
    return processGetAllShipmentByOrderIdResponse(serviceCallId);
  }
}
