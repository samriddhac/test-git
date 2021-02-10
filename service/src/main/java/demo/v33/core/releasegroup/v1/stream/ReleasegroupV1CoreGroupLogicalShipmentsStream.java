package demo.v33.core.releasegroup.v1.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.core.releasegroup.v1.service.IReleasegroupV1CoreService;

import brave.Tracer;

@Component
public class ReleasegroupV1CoreGroupLogicalShipmentsStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.grouplogicalshipments.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IReleasegroupV1CoreService releasegroupV1CoreService;

  public ReleasegroupV1CoreGroupLogicalShipmentsStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IReleasegroupV1CoreService releasegroupV1CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.releasegroupV1CoreService = releasegroupV1CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    releasegroupV1CoreService.groupLogicalShipments(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
