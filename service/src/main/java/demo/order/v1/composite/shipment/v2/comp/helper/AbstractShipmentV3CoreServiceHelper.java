package demo.order.v1.composite.shipment.v2.comp.helper;

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
import com.abcd.uop.model.BadOrder;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractShipmentV3CoreServiceHelper
    implements IShipmentV3CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateShipmentV3CoreService;
  private final Logger loggerShipmentV3CoreService;

  @Value("${shipment-service.base_uri}")
  private String baseUriShipmentV3CoreService;

  @Value("${shipment-service.service_name}")
  private String serviceNameShipmentV3CoreService;

  @Value("${shipment-service.service_version}")
  private String serviceVersionShipmentV3CoreService;

  @Override
  @CircuitBreaker(name = "createShipment-cb", fallbackMethod = "processCreateShipmentFallback")
  @Bulkhead(name = "createShipment-bh")
  public com.abcd.uop.model.Order createShipment(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV3CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV3CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV3CoreService = null;
    ServiceData serviceDataShipmentV3CoreService = null;
    serviceRequestContextShipmentV3CoreService = processCreateShipmentRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV3CoreService);
    serviceRequestContextShipmentV3CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV3CoreService + "/op/v1/order/shipment/create"))
            .queryParams(serviceRequestContextShipmentV3CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV3CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV3CoreService.setMethod(HttpMethod.POST.name());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService = new ServiceData();
      serviceDataShipmentV3CoreService.setName(serviceNameShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setVersion(serviceVersionShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setOperation(HttpMethod.POST.toString());
      serviceDataShipmentV3CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    loggerShipmentV3CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        serviceRequestContextShipmentV3CoreService.getBody());

    responseEntityShipmentV3CoreService =
        restTemplateShipmentV3CoreService.exchange(
            serviceRequestContextShipmentV3CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextShipmentV3CoreService.getBody(),
                serviceRequestContextShipmentV3CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV3CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityShipmentV3CoreService.getStatusCode().value()),
        responseEntityShipmentV3CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV3CoreService.setBody(
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService.setHeaders(
        responseEntityShipmentV3CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    return processCreateShipmentResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(name = "updateShipment-cb", fallbackMethod = "processUpdateShipmentFallback")
  @Bulkhead(name = "updateShipment-bh")
  public com.abcd.uop.model.Order updateShipment(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV3CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV3CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV3CoreService = null;
    ServiceData serviceDataShipmentV3CoreService = null;
    serviceRequestContextShipmentV3CoreService = processUpdateShipmentRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV3CoreService);
    serviceRequestContextShipmentV3CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV3CoreService + "/op/v1/order/shipment/update"))
            .queryParams(serviceRequestContextShipmentV3CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV3CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV3CoreService.setMethod(HttpMethod.PUT.name());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService = new ServiceData();
      serviceDataShipmentV3CoreService.setName(serviceNameShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setVersion(serviceVersionShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setOperation(HttpMethod.PUT.toString());
      serviceDataShipmentV3CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    loggerShipmentV3CoreService.logRestClientRequest(
        HttpMethod.PUT.name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        serviceRequestContextShipmentV3CoreService.getBody());

    responseEntityShipmentV3CoreService =
        restTemplateShipmentV3CoreService.exchange(
            serviceRequestContextShipmentV3CoreService.getUrl(),
            HttpMethod.PUT,
            new HttpEntity<>(
                serviceRequestContextShipmentV3CoreService.getBody(),
                serviceRequestContextShipmentV3CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV3CoreService.logRestClientResponse(
        HttpMethod.PUT.name(),
        String.valueOf(responseEntityShipmentV3CoreService.getStatusCode().value()),
        responseEntityShipmentV3CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV3CoreService.setBody(
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService.setHeaders(
        responseEntityShipmentV3CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    return processUpdateShipmentResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getShipmentByShipmentId-cb",
      fallbackMethod = "processGetShipmentByShipmentIdFallback")
  @Bulkhead(name = "getShipmentByShipmentId-bh")
  public BadOrder getShipmentByShipmentId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV3CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV3CoreService = null;
    ResponseEntity<BadOrder> responseEntityShipmentV3CoreService = null;
    ServiceData serviceDataShipmentV3CoreService = null;
    serviceRequestContextShipmentV3CoreService =
        processGetShipmentByShipmentIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV3CoreService);
    serviceRequestContextShipmentV3CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV3CoreService
                    + "/op/v1/order/shipment/{shipmentorderid}/{shipmentid} "))
            .queryParams(serviceRequestContextShipmentV3CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV3CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV3CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService = new ServiceData();
      serviceDataShipmentV3CoreService.setName(serviceNameShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setVersion(serviceVersionShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV3CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    loggerShipmentV3CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        null);

    responseEntityShipmentV3CoreService =
        restTemplateShipmentV3CoreService.exchange(
            serviceRequestContextShipmentV3CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV3CoreService.getHeaders()),
            BadOrder.class);

    loggerShipmentV3CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV3CoreService.getStatusCode().value()),
        responseEntityShipmentV3CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV3CoreService.setBody(
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService.setHeaders(
        responseEntityShipmentV3CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    return processGetShipmentByShipmentIdResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getAllShipmentByPoNumber-cb",
      fallbackMethod = "processGetAllShipmentByPoNumberFallback")
  @Bulkhead(name = "getAllShipmentByPoNumber-bh")
  public com.abcd.uop.returning.model.Order getAllShipmentByPoNumber(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV3CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV3CoreService = null;
    ResponseEntity<com.abcd.uop.returning.model.Order> responseEntityShipmentV3CoreService = null;
    ServiceData serviceDataShipmentV3CoreService = null;
    serviceRequestContextShipmentV3CoreService =
        processGetAllShipmentByPoNumberRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV3CoreService);
    serviceRequestContextShipmentV3CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV3CoreService + "/op/v1/order/shipments/ponumber/{ponumber} "))
            .queryParams(serviceRequestContextShipmentV3CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV3CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV3CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService = new ServiceData();
      serviceDataShipmentV3CoreService.setName(serviceNameShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setVersion(serviceVersionShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV3CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    loggerShipmentV3CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        null);

    responseEntityShipmentV3CoreService =
        restTemplateShipmentV3CoreService.exchange(
            serviceRequestContextShipmentV3CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV3CoreService.getHeaders()),
            com.abcd.uop.returning.model.Order.class);

    loggerShipmentV3CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV3CoreService.getStatusCode().value()),
        responseEntityShipmentV3CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV3CoreService.setBody(
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService.setHeaders(
        responseEntityShipmentV3CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    return processGetAllShipmentByPoNumberResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getShipmentByShipmentRef-cb",
      fallbackMethod = "processGetShipmentByShipmentRefFallback")
  @Bulkhead(name = "getShipmentByShipmentRef-bh")
  public com.abcd.uop.model.Order getShipmentByShipmentRef(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV3CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV3CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV3CoreService = null;
    ServiceData serviceDataShipmentV3CoreService = null;
    serviceRequestContextShipmentV3CoreService =
        processGetShipmentByShipmentRefRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV3CoreService);
    serviceRequestContextShipmentV3CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV3CoreService
                    + "/op/v1/order/shipments/shipmentref/{shipmentref} "))
            .queryParams(serviceRequestContextShipmentV3CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV3CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV3CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService = new ServiceData();
      serviceDataShipmentV3CoreService.setName(serviceNameShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setVersion(serviceVersionShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV3CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    loggerShipmentV3CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        null);

    responseEntityShipmentV3CoreService =
        restTemplateShipmentV3CoreService.exchange(
            serviceRequestContextShipmentV3CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV3CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV3CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV3CoreService.getStatusCode().value()),
        responseEntityShipmentV3CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV3CoreService.setBody(
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService.setHeaders(
        responseEntityShipmentV3CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    return processGetShipmentByShipmentRefResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(
      name = "getAllShipmentByOrderId-cb",
      fallbackMethod = "processGetAllShipmentByOrderIdFallback")
  @Bulkhead(name = "getAllShipmentByOrderId-bh")
  public com.abcd.uop.model.Order getAllShipmentByOrderId(String serviceCallId) {
    ServiceRequestContext serviceRequestContextShipmentV3CoreService = null;
    ServiceResponseContext serviceResponseContextShipmentV3CoreService = null;
    ResponseEntity<com.abcd.uop.model.Order> responseEntityShipmentV3CoreService = null;
    ServiceData serviceDataShipmentV3CoreService = null;
    serviceRequestContextShipmentV3CoreService =
        processGetAllShipmentByOrderIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextShipmentV3CoreService);
    serviceRequestContextShipmentV3CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriShipmentV3CoreService + "/op/v1/order/shipments/{shipmentorderid} "))
            .queryParams(serviceRequestContextShipmentV3CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextShipmentV3CoreService.getPathParams())
            .toUriString());
    serviceRequestContextShipmentV3CoreService.setMethod(HttpMethod.GET.name());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService = new ServiceData();
      serviceDataShipmentV3CoreService.setName(serviceNameShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setVersion(serviceVersionShipmentV3CoreService);
      serviceDataShipmentV3CoreService.setOperation(HttpMethod.GET.toString());
      serviceDataShipmentV3CoreService.setServiceRequestContext(
          serviceRequestContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    loggerShipmentV3CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        null);

    responseEntityShipmentV3CoreService =
        restTemplateShipmentV3CoreService.exchange(
            serviceRequestContextShipmentV3CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextShipmentV3CoreService.getHeaders()),
            com.abcd.uop.model.Order.class);

    loggerShipmentV3CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityShipmentV3CoreService.getStatusCode().value()),
        responseEntityShipmentV3CoreService.getStatusCode().name(),
        serviceRequestContextShipmentV3CoreService.getEventType(),
        serviceRequestContextShipmentV3CoreService.getEventMessage(),
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService = new ServiceResponseContext();
    serviceResponseContextShipmentV3CoreService.setBody(
        responseEntityShipmentV3CoreService.getBody());
    serviceResponseContextShipmentV3CoreService.setHeaders(
        responseEntityShipmentV3CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataShipmentV3CoreService.setServiceResponseContext(
          serviceResponseContextShipmentV3CoreService);
      setServiceCallResult(serviceCallId, serviceDataShipmentV3CoreService);
    }
    return processGetAllShipmentByOrderIdResponse(serviceCallId);
  }
}
