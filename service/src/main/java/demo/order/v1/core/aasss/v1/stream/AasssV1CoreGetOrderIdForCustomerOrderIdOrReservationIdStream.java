package demo.order.v1.core.aasss.v1.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.aasss.v1.service.IAasssV1CoreService;

import brave.Tracer;

@Component
public class AasssV1CoreGetOrderIdForCustomerOrderIdOrReservationIdStream
    extends AbstractStreamSubscriber implements ServiceContextUtil {

  @Value("${topic.subscription.getorderidforcustomerorderidorreservationid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAasssV1CoreService aasssV1CoreService;

  public AasssV1CoreGetOrderIdForCustomerOrderIdOrReservationIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAasssV1CoreService aasssV1CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.aasssV1CoreService = aasssV1CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {}

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
