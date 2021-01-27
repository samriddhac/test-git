package demo.fihub.composite.air.v4.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.order.foundation.core.utils.json.JsonUtils;
import com.macys.order.foundation.core.utils.logging.Logger;
import com.macys.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.order.foundation.core.utils.msg.subsciber.AbstractStreamSubscriber;
import demo.fihub.composite.air.v4.IAirV4CompositeService;

import demo.fihub.composite.air.v4.model.*;
import brave.Tracer;

@Component
public class AirV4CompositePostAircraftsStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.postaircrafts.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAirV4CompositeService airV4CompositeService;

  public AirV4CompositePostAircraftsStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAirV4CompositeService airV4CompositeService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.airV4CompositeService = airV4CompositeService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Aircraft source = jsonUtils.convertFromJson(getPayload(), Aircraft.class);
    getServiceRequestContext().setBody(source);
    airV4CompositeService.postAircrafts(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
