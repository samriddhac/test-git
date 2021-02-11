package demo.order.v1.core.order.abc.v1.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.order.abc.v1.service.IOrderAbcV1CoreService;

import brave.Tracer;

@Component
public class OrderAbcV1CoreCreateOrderStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.createorder.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IOrderAbcV1CoreService orderAbcV1CoreService;

  public OrderAbcV1CoreCreateOrderStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IOrderAbcV1CoreService orderAbcV1CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.orderAbcV1CoreService = orderAbcV1CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    orderAbcV1CoreService.createOrder(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
