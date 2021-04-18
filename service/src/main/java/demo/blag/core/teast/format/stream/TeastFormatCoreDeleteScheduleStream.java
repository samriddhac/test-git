package demo.blag.core.teast.format.stream;

import brave.Tracer;
import com.google.pubsub.v1.PubsubMessage;
import demo.blag.core.teast.format.model.*;
import demo.blag.core.teast.format.service.ITeastFormatCoreService;
import demo.cosmos.core.utils.execution.ServiceContextUtil;
import demo.cosmos.core.utils.json.JsonUtils;
import demo.cosmos.core.utils.logging.Logger;
import demo.cosmos.core.utils.message.validation.MessageValidator;
import demo.cosmos.core.utils.msg.subscriber.AbstractStreamSubscriber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

@Component
public class TeastFormatCoreDeleteScheduleStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.deleteschedule.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final ITeastFormatCoreService teastFormatCoreService;

  public TeastFormatCoreDeleteScheduleStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      ITeastFormatCoreService teastFormatCoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.teastFormatCoreService = teastFormatCoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Schedule source = jsonUtils.convertFromJson(getPayload(), Schedule.class);
    getServiceRequestContext().setBody(source);
    teastFormatCoreService.deleteSchedule(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
