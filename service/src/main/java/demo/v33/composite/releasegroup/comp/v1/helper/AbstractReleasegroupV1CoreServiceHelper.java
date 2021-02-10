package demo.v33.composite.releasegroup.comp.v1.helper;

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
import com.abcd.uop.model.Order;

import io.github.resilience4j.bulkhead.annotation.Bulkhead;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AbstractReleasegroupV1CoreServiceHelper
    implements IReleasegroupV1CoreServiceHelper, ServiceExecutionContextUtil {

  private final RestTemplate restTemplateReleasegroupV1CoreService;
  private final Logger loggerReleasegroupV1CoreService;

  @Value("${Releasegroup-Service.base_uri}")
  private String baseUriReleasegroupV1CoreService;

  @Value("${Releasegroup-Service.service_name}")
  private String serviceNameReleasegroupV1CoreService;

  @Value("${Releasegroup-Service.service_version}")
  private String serviceVersionReleasegroupV1CoreService;

  @Override
  @CircuitBreaker(
      name = "groupLogicalShipments-cb",
      fallbackMethod = "processGroupLogicalShipmentsFallback")
  @Bulkhead(name = "groupLogicalShipments-bh")
  public List<List<Order>> groupLogicalShipments(String serviceCallId) {
    ServiceRequestContext serviceRequestContextReleasegroupV1CoreService = null;
    ServiceResponseContext serviceResponseContextReleasegroupV1CoreService = null;
    ResponseEntity<Order[]> responseEntityReleasegroupV1CoreService = null;
    ServiceData serviceDataReleasegroupV1CoreService = null;
    serviceRequestContextReleasegroupV1CoreService =
        processGroupLogicalShipmentsRequest(serviceCallId);
    setDefaultHeaders(serviceRequestContextReleasegroupV1CoreService);
    serviceRequestContextReleasegroupV1CoreService.setUrl(
        UriComponentsBuilder.fromHttpUrl(
                (baseUriReleasegroupV1CoreService + "/op/v1/order/release/logicalshipments"))
            .queryParams(serviceRequestContextReleasegroupV1CoreService.getQueryParams())
            .buildAndExpand(serviceRequestContextReleasegroupV1CoreService.getPathParams())
            .toUriString());
    serviceRequestContextReleasegroupV1CoreService.setMethod(HttpMethod.POST.name());
    if (serviceCallId != null) {
      serviceDataReleasegroupV1CoreService = new ServiceData();
      serviceDataReleasegroupV1CoreService.setName(serviceNameReleasegroupV1CoreService);
      serviceDataReleasegroupV1CoreService.setVersion(serviceVersionReleasegroupV1CoreService);
      serviceDataReleasegroupV1CoreService.setOperation(HttpMethod.POST.toString());
      serviceDataReleasegroupV1CoreService.setServiceRequestContext(
          serviceRequestContextReleasegroupV1CoreService);
      setServiceCallResult(serviceCallId, serviceDataReleasegroupV1CoreService);
    }
    loggerReleasegroupV1CoreService.logRestClientRequest(
        HttpMethod.POST.name(),
        serviceRequestContextReleasegroupV1CoreService.getEventType(),
        serviceRequestContextReleasegroupV1CoreService.getEventMessage(),
        serviceRequestContextReleasegroupV1CoreService.getBody());

    responseEntityReleasegroupV1CoreService =
        restTemplateReleasegroupV1CoreService.exchange(
            serviceRequestContextReleasegroupV1CoreService.getUrl(),
            HttpMethod.POST,
            new HttpEntity<>(
                serviceRequestContextReleasegroupV1CoreService.getBody(),
                serviceRequestContextReleasegroupV1CoreService.getHeaders()),
            Order[].class);

    loggerReleasegroupV1CoreService.logRestClientResponse(
        HttpMethod.POST.name(),
        String.valueOf(responseEntityReleasegroupV1CoreService.getStatusCode().value()),
        responseEntityReleasegroupV1CoreService.getStatusCode().name(),
        serviceRequestContextReleasegroupV1CoreService.getEventType(),
        serviceRequestContextReleasegroupV1CoreService.getEventMessage(),
        responseEntityReleasegroupV1CoreService.getBody());
    serviceResponseContextReleasegroupV1CoreService = new ServiceResponseContext();
    serviceResponseContextReleasegroupV1CoreService.setBody(
        responseEntityReleasegroupV1CoreService.getBody());
    serviceResponseContextReleasegroupV1CoreService.setHeaders(
        responseEntityReleasegroupV1CoreService.getHeaders());
    if (serviceCallId != null) {
      serviceDataReleasegroupV1CoreService.setServiceResponseContext(
          serviceResponseContextReleasegroupV1CoreService);
      setServiceCallResult(serviceCallId, serviceDataReleasegroupV1CoreService);
    }
    return processGroupLogicalShipmentsResponse(serviceCallId);
  }
}
