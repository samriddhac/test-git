package demo.v33.core.avc.v5.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.core.avc.v5.service.IAvcV5CoreService;

import demo.v33.core.avc.v5.model.*;
import brave.Tracer;

@Component
public class AvcV5CoreUpdateShipmentStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.updateshipment.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAvcV5CoreService avcV5CoreService;

  public AvcV5CoreUpdateShipmentStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAvcV5CoreService avcV5CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.avcV5CoreService = avcV5CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    avcV5CoreService.updateShipment(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
