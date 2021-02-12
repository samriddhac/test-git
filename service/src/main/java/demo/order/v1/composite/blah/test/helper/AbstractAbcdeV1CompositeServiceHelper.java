package demo.order.v1.composite.blah.test.helper;

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

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractAbcdeV1CompositeServiceHelper
    implements IAbcdeV1CompositeServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateAbcdeV1CompositeService;
  private final Logger loggerAbcdeV1CompositeService;

  @Value("${order-core-service.base_uri}")
  private String baseUriAbcdeV1CompositeService;

  @Value("${order-core-service.service_name}")
  private String serviceNameAbcdeV1CompositeService;

  @Value("${order-core-service.service_version}")
  private String serviceVersionAbcdeV1CompositeService;

  @Override
  @CircuitBreaker(
      name = "getOrderIdForCustomerOrderIdOrReservationId-cb",
      fallbackMethod = "processGetOrderIdForCustomerOrderIdOrReservationIdFallback")
  @Bulkhead(name = "getOrderIdForCustomerOrderIdOrReservationId-bh")
  public String getOrderIdForCustomerOrderIdOrReservationId(String serviceCallId) {
    Assert.isTrue(!StringUtils.isAllBlank(serviceCallId), "serviceCallId cannot be null or blank");
    ServiceRequestContext serviceRequestContextAbcdeV1CompositeService = null;
    ServiceResponseContext serviceResponseContextAbcdeV1CompositeService = null;
    ResponseEntity<String> responseEntityAbcdeV1CompositeService = null;
    ServiceData serviceDataAbcdeV1CompositeService = null;
    serviceRequestContextAbcdeV1CompositeService =
        processGetOrderIdForCustomerOrderIdOrReservationIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextAbcdeV1CompositeService);
    serviceRequestContextAbcdeV1CompositeService.setUrl(
        UriComponentsBuilder.fromHttpUrl((baseUriAbcdeV1CompositeService + "/op/v1/order/orderid"))
            .queryParams(serviceRequestContextAbcdeV1CompositeService.getQueryParams())
            .buildAndExpand(serviceRequestContextAbcdeV1CompositeService.getPathParams())
            .toUriString());
    serviceRequestContextAbcdeV1CompositeService.setMethod(HttpMethod.GET.name());
    serviceDataAbcdeV1CompositeService = new ServiceData();
    serviceDataAbcdeV1CompositeService.setName(serviceNameAbcdeV1CompositeService);
    serviceDataAbcdeV1CompositeService.setVersion(serviceVersionAbcdeV1CompositeService);
    serviceDataAbcdeV1CompositeService.setOperation(HttpMethod.GET.toString());
    serviceDataAbcdeV1CompositeService.setServiceRequestContext(
        serviceRequestContextAbcdeV1CompositeService);
    setServiceCallResult(serviceCallId, serviceDataAbcdeV1CompositeService);
    loggerAbcdeV1CompositeService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextAbcdeV1CompositeService.getEventType(),
        serviceRequestContextAbcdeV1CompositeService.getEventMessage(),
        null);

    responseEntityAbcdeV1CompositeService =
        restTemplateAbcdeV1CompositeService.exchange(
            serviceRequestContextAbcdeV1CompositeService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextAbcdeV1CompositeService.getHeaders()),
            String.class);

    loggerAbcdeV1CompositeService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityAbcdeV1CompositeService.getStatusCode().value()),
        responseEntityAbcdeV1CompositeService.getStatusCode().name(),
        serviceRequestContextAbcdeV1CompositeService.getEventType(),
        serviceRequestContextAbcdeV1CompositeService.getEventMessage(),
        responseEntityAbcdeV1CompositeService.getBody());
    serviceResponseContextAbcdeV1CompositeService = new ServiceResponseContext();
    serviceResponseContextAbcdeV1CompositeService.setBody(
        responseEntityAbcdeV1CompositeService.getBody());
    serviceResponseContextAbcdeV1CompositeService.setHeaders(
        responseEntityAbcdeV1CompositeService.getHeaders());
    serviceDataAbcdeV1CompositeService.setServiceResponseContext(
        serviceResponseContextAbcdeV1CompositeService);
    setServiceCallResult(serviceCallId, serviceDataAbcdeV1CompositeService);
    return processGetOrderIdForCustomerOrderIdOrReservationIdResponse(serviceCallId);
  }
}
