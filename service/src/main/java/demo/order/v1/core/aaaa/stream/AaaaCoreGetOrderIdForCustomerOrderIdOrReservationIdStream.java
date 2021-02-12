package demo.order.v1.core.aaaa.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.aaaa.service.IAaaaCoreService;

import brave.Tracer;

@Component
public class AaaaCoreGetOrderIdForCustomerOrderIdOrReservationIdStream
    extends AbstractStreamSubscriber implements ServiceContextUtil {

  @Value("${topic.subscription.getorderidforcustomerorderidorreservationid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAaaaCoreService aaaaCoreService;

  public AaaaCoreGetOrderIdForCustomerOrderIdOrReservationIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAaaaCoreService aaaaCoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.aaaaCoreService = aaaaCoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {}

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
