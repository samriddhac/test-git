package demo.fihub.core.aav.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.order.foundation.core.utils.json.JsonUtils;
import com.macys.order.foundation.core.utils.logging.Logger;
import com.macys.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.fihub.core.aav.service.IAavCoreService;

import brave.Tracer;

@Component
public class AavCoreGetOrderIdForCustomerOrderIdOrReservationIdStream
    extends AbstractStreamSubscriber implements ServiceContextUtil {

  @Value("${topic.subscription.getorderidforcustomerorderidorreservationid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAavCoreService aavCoreService;

  public AavCoreGetOrderIdForCustomerOrderIdOrReservationIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAavCoreService aavCoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.aavCoreService = aavCoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {}

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
