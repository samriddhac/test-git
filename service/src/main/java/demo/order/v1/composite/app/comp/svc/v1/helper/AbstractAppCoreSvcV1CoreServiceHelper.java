package demo.order.v1.composite.app.comp.svc.v1.helper;

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
public abstract class AbstractAppCoreSvcV1CoreServiceHelper
    implements IAppCoreSvcV1CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateAppCoreSvcV1CoreService;
  private final Logger loggerAppCoreSvcV1CoreService;

  @Value("${Releasegroup-Service.base_uri}")
  private String baseUriAppCoreSvcV1CoreService;

  @Value("${Releasegroup-Service.service_name}")
  private String serviceNameAppCoreSvcV1CoreService;

  @Value("${Releasegroup-Service.service_version}")
  private String serviceVersionAppCoreSvcV1CoreService;

  @Override
  @CircuitBreaker(
      name = "groupLogicalShipments-cb",
      fallbackMethod = "processGroupLogicalShipmentsFallback")
  @Bulkhead(name = "groupLogicalShipments-bh")
  public List<List<Order>> groupLogicalShipments(String serviceCallId) {
    Assert.isTrue(!StringUtils.isAllBlank(serviceCallId), "serviceCallId cannot be null or blank");
    ServiceRequestContext serviceRequestContextAppCoreSvcV1CoreService = null;
    ServiceResponseContext serviceResponseContextAppCoreSvcV1CoreService = null;
    ResponseEntity<Order[][]> responseEntityAppCoreSvcV1CoreService = null;
    ServiceData serviceDataAppCoreSvcV1CoreService = null;
    serviceRequestContextAppCoreSvcV1CoreService =
        processGroupLogicalShipmentsRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextAppCoreSvcV1CoreService);
    serviceRequestContextAppCoreSvcV1CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriAppCoreSvcV1CoreService + "/op/v1/order/release/logicalshipments"))
            .queryParams(serviceRequestContextAppCoreSvcV1CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextAppCoreSvcV1CoreService.getPathParams())
            .toUriString());
    serviceRequestContextAppCoreSvcV1CoreService.setMethod(HttpMethod.POST.name());
    serviceDataAppCoreSvcV1CoreService = new ServiceData();
    serviceDataAppCoreSvcV1CoreService.setName(serviceNameAppCoreSvcV1CoreService);
    serviceDataAppCoreSvcV1CoreService.setVersion(serviceVersionAppCoreSvcV1CoreService);
    serviceDataAppCoreSvcV1CoreService.setOperation(HttpMethod.POST.toString());
    serviceDataAppCoreSvcV1CoreService.setServiceRequestContext(
        serviceRequestContextAppCoreSvcV1CoreService);
    setServiceCallResult(serviceCallId, serviceDataAppCoreSvcV1CoreService);
    loggerAppCoreSvcV1CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventType(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventMessage(),
        serviceRequestContextAppCoreSvcV1CoreService.getBody());

    responseEntityAppCoreSvcV1CoreService =
        restTemplateAppCoreSvcV1CoreService.exchange(
            serviceRequestContextAppCoreSvcV1CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextAppCoreSvcV1CoreService.getBody(),
                serviceRequestContextAppCoreSvcV1CoreService.getHeaders()),
            Order[][].class);

    loggerAppCoreSvcV1CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityAppCoreSvcV1CoreService.getStatusCode().value()),
        responseEntityAppCoreSvcV1CoreService.getStatusCode().name(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventType(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventMessage(),
        responseEntityAppCoreSvcV1CoreService.getBody());
    serviceResponseContextAppCoreSvcV1CoreService = new ServiceResponseContext();
    serviceResponseContextAppCoreSvcV1CoreService.setBody(
        responseEntityAppCoreSvcV1CoreService.getBody());
    serviceResponseContextAppCoreSvcV1CoreService.setHeaders(
        responseEntityAppCoreSvcV1CoreService.getHeaders());
    serviceDataAppCoreSvcV1CoreService.setServiceResponseContext(
        serviceResponseContextAppCoreSvcV1CoreService);
    setServiceCallResult(serviceCallId, serviceDataAppCoreSvcV1CoreService);
    return processGroupLogicalShipmentsResponse(serviceCallId);
  }

  @Override
  @CircuitBreaker(name = "splitLineItems-cb", fallbackMethod = "processSplitLineItemsFallback")
  @Bulkhead(name = "splitLineItems-bh")
  public List<List<Order>> splitLineItems(String serviceCallId) {
    Assert.isTrue(!StringUtils.isAllBlank(serviceCallId), "serviceCallId cannot be null or blank");
    ServiceRequestContext serviceRequestContextAppCoreSvcV1CoreService = null;
    ServiceResponseContext serviceResponseContextAppCoreSvcV1CoreService = null;
    ResponseEntity<Order[][]> responseEntityAppCoreSvcV1CoreService = null;
    ServiceData serviceDataAppCoreSvcV1CoreService = null;
    serviceRequestContextAppCoreSvcV1CoreService = processSplitLineItemsRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextAppCoreSvcV1CoreService);
    serviceRequestContextAppCoreSvcV1CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriAppCoreSvcV1CoreService + "/op/v1/order/release/releasegroups"))
            .queryParams(serviceRequestContextAppCoreSvcV1CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextAppCoreSvcV1CoreService.getPathParams())
            .toUriString());
    serviceRequestContextAppCoreSvcV1CoreService.setMethod(HttpMethod.POST.name());
    serviceDataAppCoreSvcV1CoreService = new ServiceData();
    serviceDataAppCoreSvcV1CoreService.setName(serviceNameAppCoreSvcV1CoreService);
    serviceDataAppCoreSvcV1CoreService.setVersion(serviceVersionAppCoreSvcV1CoreService);
    serviceDataAppCoreSvcV1CoreService.setOperation(HttpMethod.POST.toString());
    serviceDataAppCoreSvcV1CoreService.setServiceRequestContext(
        serviceRequestContextAppCoreSvcV1CoreService);
    setServiceCallResult(serviceCallId, serviceDataAppCoreSvcV1CoreService);
    loggerAppCoreSvcV1CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventType(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventMessage(),
        serviceRequestContextAppCoreSvcV1CoreService.getBody());

    responseEntityAppCoreSvcV1CoreService =
        restTemplateAppCoreSvcV1CoreService.exchange(
            serviceRequestContextAppCoreSvcV1CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextAppCoreSvcV1CoreService.getBody(),
                serviceRequestContextAppCoreSvcV1CoreService.getHeaders()),
            Order[][].class);

    loggerAppCoreSvcV1CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityAppCoreSvcV1CoreService.getStatusCode().value()),
        responseEntityAppCoreSvcV1CoreService.getStatusCode().name(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventType(),
        serviceRequestContextAppCoreSvcV1CoreService.getEventMessage(),
        responseEntityAppCoreSvcV1CoreService.getBody());
    serviceResponseContextAppCoreSvcV1CoreService = new ServiceResponseContext();
    serviceResponseContextAppCoreSvcV1CoreService.setBody(
        responseEntityAppCoreSvcV1CoreService.getBody());
    serviceResponseContextAppCoreSvcV1CoreService.setHeaders(
        responseEntityAppCoreSvcV1CoreService.getHeaders());
    serviceDataAppCoreSvcV1CoreService.setServiceResponseContext(
        serviceResponseContextAppCoreSvcV1CoreService);
    setServiceCallResult(serviceCallId, serviceDataAppCoreSvcV1CoreService);
    return processSplitLineItemsResponse(serviceCallId);
  }
}
