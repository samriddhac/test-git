package demo.v33.core.avc.v4.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.core.avc.v4.service.IAvcV4CoreService;

import demo.v33.core.avc.v4.model.*;
import brave.Tracer;

@Component
public class AvcV4CoreGetShipmentByShipmentIdStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.getshipmentbyshipmentid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAvcV4CoreService avcV4CoreService;

  public AvcV4CoreGetShipmentByShipmentIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAvcV4CoreService avcV4CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.avcV4CoreService = avcV4CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    avcV4CoreService.getShipmentByShipmentId(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
