package demo.v33.core.avc.v3.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.core.avc.v3.service.IAvcV3CoreService;

import demo.v33.core.avc.v3.model.*;
import brave.Tracer;

@Component
public class AvcV3CoreGetShipmentByShipmentIdStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.getshipmentbyshipmentid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAvcV3CoreService avcV3CoreService;

  public AvcV3CoreGetShipmentByShipmentIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAvcV3CoreService avcV3CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.avcV3CoreService = avcV3CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    avcV3CoreService.getShipmentByShipmentId(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
