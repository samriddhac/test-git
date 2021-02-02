package demo.v33.core.demo.v36.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.core.demo.v36.service.IDemoV36CoreService;

import demo.v33.core.demo.v36.model.*;

@Component
public class DemoV36CoreCreateShipmentStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.createshipment.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IDemoV36CoreService demoV36CoreService;

  public DemoV36CoreCreateShipmentStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      IDemoV36CoreService demoV36CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.demoV36CoreService = demoV36CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    demoV36CoreService.createShipment(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
