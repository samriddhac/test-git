package demo.order.v1.composite.abcde.v1.helper;

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
public abstract class AbstractAbcdV1CoreServiceHelper
    implements IAbcdV1CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateAbcdV1CoreService;
  private final Logger loggerAbcdV1CoreService;

  @Value("${order-core-service.base_uri}")
  private String baseUriAbcdV1CoreService;

  @Value("${order-core-service.service_name}")
  private String serviceNameAbcdV1CoreService;

  @Value("${order-core-service.service_version}")
  private String serviceVersionAbcdV1CoreService;

  @Override
  @CircuitBreaker(
      name = "getOrderIdForCustomerOrderIdOrReservationId-cb",
      fallbackMethod = "processGetOrderIdForCustomerOrderIdOrReservationIdFallback")
  @Bulkhead(name = "getOrderIdForCustomerOrderIdOrReservationId-bh")
  public String getOrderIdForCustomerOrderIdOrReservationId(String serviceCallId) {
    Assert.isTrue(!StringUtils.isAllBlank(serviceCallId), "serviceCallId cannot be null or blank");
    ServiceRequestContext serviceRequestContextAbcdV1CoreService = null;
    ServiceResponseContext serviceResponseContextAbcdV1CoreService = null;
    ResponseEntity<String> responseEntityAbcdV1CoreService = null;
    ServiceData serviceDataAbcdV1CoreService = null;
    serviceRequestContextAbcdV1CoreService =
        processGetOrderIdForCustomerOrderIdOrReservationIdRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextAbcdV1CoreService);
    serviceRequestContextAbcdV1CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl((baseUriAbcdV1CoreService + "/op/v1/order/orderid"))
            .queryParams(serviceRequestContextAbcdV1CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextAbcdV1CoreService.getPathParams())
            .toUriString());
    serviceRequestContextAbcdV1CoreService.setMethod(HttpMethod.GET.name());
    serviceDataAbcdV1CoreService = new ServiceData();
    serviceDataAbcdV1CoreService.setName(serviceNameAbcdV1CoreService);
    serviceDataAbcdV1CoreService.setVersion(serviceVersionAbcdV1CoreService);
    serviceDataAbcdV1CoreService.setOperation(HttpMethod.GET.toString());
    serviceDataAbcdV1CoreService.setServiceRequestContext(serviceRequestContextAbcdV1CoreService);
    setServiceCallResult(serviceCallId, serviceDataAbcdV1CoreService);
    loggerAbcdV1CoreService.logRestClientRequest(
        HttpMethod.GET.name(),
        serviceRequestContextAbcdV1CoreService.getEventType(),
        serviceRequestContextAbcdV1CoreService.getEventMessage(),
        null);

    responseEntityAbcdV1CoreService =
        restTemplateAbcdV1CoreService.exchange(
            serviceRequestContextAbcdV1CoreService.getUrl(),
            HttpMethod.GET,
            new HttpEntity<>(serviceRequestContextAbcdV1CoreService.getHeaders()),
            String.class);

    loggerAbcdV1CoreService.logRestClientResponse(
        HttpMethod.GET.name(),
        String.valueOf(responseEntityAbcdV1CoreService.getStatusCode().value()),
        responseEntityAbcdV1CoreService.getStatusCode().name(),
        serviceRequestContextAbcdV1CoreService.getEventType(),
        serviceRequestContextAbcdV1CoreService.getEventMessage(),
        responseEntityAbcdV1CoreService.getBody());
    serviceResponseContextAbcdV1CoreService = new ServiceResponseContext();
    serviceResponseContextAbcdV1CoreService.setBody(responseEntityAbcdV1CoreService.getBody());
    serviceResponseContextAbcdV1CoreService.setHeaders(
        responseEntityAbcdV1CoreService.getHeaders());
    serviceDataAbcdV1CoreService.setServiceResponseContext(serviceResponseContextAbcdV1CoreService);
    setServiceCallResult(serviceCallId, serviceDataAbcdV1CoreService);
    return processGetOrderIdForCustomerOrderIdOrReservationIdResponse(serviceCallId);
  }
}
