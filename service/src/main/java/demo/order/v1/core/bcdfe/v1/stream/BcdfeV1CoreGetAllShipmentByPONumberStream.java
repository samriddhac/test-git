package demo.order.v1.core.bcdfe.v1.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.bcdfe.v1.service.IBcdfeV1CoreService;

import brave.Tracer;

@Component
public class BcdfeV1CoreGetAllShipmentByPONumberStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.getallshipmentbyponumber.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IBcdfeV1CoreService bcdfeV1CoreService;

  public BcdfeV1CoreGetAllShipmentByPONumberStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IBcdfeV1CoreService bcdfeV1CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.bcdfeV1CoreService = bcdfeV1CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    com.abcd.uop.model.Order source =
        jsonUtils.convertFromJson(getPayload(), com.abcd.uop.model.Order.class);
    getServiceRequestContext().setBody(source);
    bcdfeV1CoreService.getAllShipmentByPONumber(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
