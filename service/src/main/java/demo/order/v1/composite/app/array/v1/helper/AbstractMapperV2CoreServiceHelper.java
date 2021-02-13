package demo.order.v1.composite.app.array.v1.helper;

import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;
import com.macys.mst.order.foundation.core.utils.execution.ServiceData;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.execution.ServiceRequestContext;
import com.macys.mst.order.foundation.core.utils.execution.ServiceResponseContext;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.abcd.uop.model.Order;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractMapperV2CoreServiceHelper
    implements IMapperV2CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateMapperV2CoreService;
  private final Logger loggerMapperV2CoreService;

  @Value("${Releasegroup-Service.base_uri}")
  private String baseUriMapperV2CoreService;

  @Value("${Releasegroup-Service.service_name}")
  private String serviceNameMapperV2CoreService;

  @Value("${Releasegroup-Service.service_version}")
  private String serviceVersionMapperV2CoreService;

  @Override
  @CircuitBreaker(
      name = "groupLogicalShipments-cb",
      fallbackMethod = "processGroupLogicalShipmentsFallback")
  @Bulkhead(name = "groupLogicalShipments-bh")
  public List<List<Order>> groupLogicalShipments(String serviceCallId) {
    Assert.isTrue(!StringUtils.isAllBlank(serviceCallId), "serviceCallId cannot be null or blank");
    ServiceRequestContext serviceRequestContextMapperV2CoreService = null;
    ServiceResponseContext serviceResponseContextMapperV2CoreService = null;
    ResponseEntity<Order[]> responseEntityMapperV2CoreService = null;
    ServiceData serviceDataMapperV2CoreService = null;
    serviceRequestContextMapperV2CoreService = processGroupLogicalShipmentsRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextMapperV2CoreService);
    serviceRequestContextMapperV2CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriMapperV2CoreService + "/op/v1/order/release/logicalshipments"))
            .queryParams(serviceRequestContextMapperV2CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextMapperV2CoreService.getPathParams())
            .toUriString());
    serviceRequestContextMapperV2CoreService.setMethod(HttpMethod.POST.name());
    serviceDataMapperV2CoreService = new ServiceData();
    serviceDataMapperV2CoreService.setName(serviceNameMapperV2CoreService);
    serviceDataMapperV2CoreService.setVersion(serviceVersionMapperV2CoreService);
    serviceDataMapperV2CoreService.setOperation(HttpMethod.POST.toString());
    serviceDataMapperV2CoreService.setServiceRequestContext(
        serviceRequestContextMapperV2CoreService);
    setServiceCallResult(serviceCallId, serviceDataMapperV2CoreService);
    loggerMapperV2CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextMapperV2CoreService.getEventType(),
        serviceRequestContextMapperV2CoreService.getEventMessage(),
        serviceRequestContextMapperV2CoreService.getBody());

    responseEntityMapperV2CoreService =
        restTemplateMapperV2CoreService.exchange(
            serviceRequestContextMapperV2CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextMapperV2CoreService.getBody(),
                serviceRequestContextMapperV2CoreService.getHeaders()),
            Order[].class);

    loggerMapperV2CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityMapperV2CoreService.getStatusCode().value()),
        responseEntityMapperV2CoreService.getStatusCode().name(),
        serviceRequestContextMapperV2CoreService.getEventType(),
        serviceRequestContextMapperV2CoreService.getEventMessage(),
        responseEntityMapperV2CoreService.getBody());
    serviceResponseContextMapperV2CoreService = new ServiceResponseContext();
    serviceResponseContextMapperV2CoreService.setBody(responseEntityMapperV2CoreService.getBody());
    serviceResponseContextMapperV2CoreService.setHeaders(
        responseEntityMapperV2CoreService.getHeaders());
    serviceDataMapperV2CoreService.setServiceResponseContext(
        serviceResponseContextMapperV2CoreService);
    setServiceCallResult(serviceCallId, serviceDataMapperV2CoreService);
    return processGroupLogicalShipmentsResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(name = "splitLineItems-cb", fallbackMethod = "processSplitLineItemsFallback")
  @Bulkhead(name = "splitLineItems-bh")
  public List<List<Order>> splitLineItems(String serviceCallId) {
    Assert.isTrue(!StringUtils.isAllBlank(serviceCallId), "serviceCallId cannot be null or blank");
    ServiceRequestContext serviceRequestContextMapperV2CoreService = null;
    ServiceResponseContext serviceResponseContextMapperV2CoreService = null;
    ResponseEntity<Order[]> responseEntityMapperV2CoreService = null;
    ServiceData serviceDataMapperV2CoreService = null;
    serviceRequestContextMapperV2CoreService = processSplitLineItemsRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextMapperV2CoreService);
    serviceRequestContextMapperV2CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriMapperV2CoreService + "/op/v1/order/release/releasegroups"))
            .queryParams(serviceRequestContextMapperV2CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextMapperV2CoreService.getPathParams())
            .toUriString());
    serviceRequestContextMapperV2CoreService.setMethod(HttpMethod.POST.name());
    serviceDataMapperV2CoreService = new ServiceData();
    serviceDataMapperV2CoreService.setName(serviceNameMapperV2CoreService);
    serviceDataMapperV2CoreService.setVersion(serviceVersionMapperV2CoreService);
    serviceDataMapperV2CoreService.setOperation(HttpMethod.POST.toString());
    serviceDataMapperV2CoreService.setServiceRequestContext(
        serviceRequestContextMapperV2CoreService);
    setServiceCallResult(serviceCallId, serviceDataMapperV2CoreService);
    loggerMapperV2CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextMapperV2CoreService.getEventType(),
        serviceRequestContextMapperV2CoreService.getEventMessage(),
        serviceRequestContextMapperV2CoreService.getBody());

    responseEntityMapperV2CoreService =
        restTemplateMapperV2CoreService.exchange(
            serviceRequestContextMapperV2CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextMapperV2CoreService.getBody(),
                serviceRequestContextMapperV2CoreService.getHeaders()),
            Order[].class);

    loggerMapperV2CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityMapperV2CoreService.getStatusCode().value()),
        responseEntityMapperV2CoreService.getStatusCode().name(),
        serviceRequestContextMapperV2CoreService.getEventType(),
        serviceRequestContextMapperV2CoreService.getEventMessage(),
        responseEntityMapperV2CoreService.getBody());
    serviceResponseContextMapperV2CoreService = new ServiceResponseContext();
    serviceResponseContextMapperV2CoreService.setBody(responseEntityMapperV2CoreService.getBody());
    serviceResponseContextMapperV2CoreService.setHeaders(
        responseEntityMapperV2CoreService.getHeaders());
    serviceDataMapperV2CoreService.setServiceResponseContext(
        serviceResponseContextMapperV2CoreService);
    setServiceCallResult(serviceCallId, serviceDataMapperV2CoreService);
    return processSplitLineItemsResponse(serviceCallId);
  }
}
