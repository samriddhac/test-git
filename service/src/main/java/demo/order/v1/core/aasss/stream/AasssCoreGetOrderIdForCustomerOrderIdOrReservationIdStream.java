package demo.order.v1.core.aasss.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.aasss.service.IAasssCoreService;

import brave.Tracer;

@Component
public class AasssCoreGetOrderIdForCustomerOrderIdOrReservationIdStream
    extends AbstractStreamSubscriber implements ServiceContextUtil {

  @Value("${topic.subscription.getorderidforcustomerorderidorreservationid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAasssCoreService aasssCoreService;

  public AasssCoreGetOrderIdForCustomerOrderIdOrReservationIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAasssCoreService aasssCoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.aasssCoreService = aasssCoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {}

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
