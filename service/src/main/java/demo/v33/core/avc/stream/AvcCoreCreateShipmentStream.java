package demo.v33.core.avc.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.core.avc.service.IAvcCoreService;

import demo.v33.core.avc.model.*;
import brave.Tracer;

@Component
public class AvcCoreCreateShipmentStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.createshipment.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAvcCoreService avcCoreService;

  public AvcCoreCreateShipmentStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAvcCoreService avcCoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.avcCoreService = avcCoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    avcCoreService.createShipment(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
