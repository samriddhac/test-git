package demo.order.v1.core.varf.v1.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.varf.v1.service.IVarfV1CoreService;

import com.abcd.uop.model.Order;
import brave.Tracer;

@Component
public class VarfV1CoreGroupLogicalShipmentsStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.grouplogicalshipments.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IVarfV1CoreService varfV1CoreService;

  public VarfV1CoreGroupLogicalShipmentsStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IVarfV1CoreService varfV1CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.varfV1CoreService = varfV1CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    Order source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    varfV1CoreService.groupLogicalShipments(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
