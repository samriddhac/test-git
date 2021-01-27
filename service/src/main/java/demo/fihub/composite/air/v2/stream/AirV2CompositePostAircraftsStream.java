package demo.fihub.composite.air.v2.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.order.foundation.core.utils.json.JsonUtils;
import com.macys.order.foundation.core.utils.logging.Logger;
import com.macys.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.order.foundation.core.utils.msg.subsciber.AbstractStreamSubscriber;
import demo.fihub.composite.air.v2.IAirV2CompositeService;

import demo.fihub.composite.air.v2.model.*;
import brave.Tracer;

@Component
public class AirV2CompositePostAircraftsStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.postaircrafts.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAirV2CompositeService airV2CompositeService;

  public AirV2CompositePostAircraftsStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAirV2CompositeService airV2CompositeService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.airV2CompositeService = airV2CompositeService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {}

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
