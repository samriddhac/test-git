package demo.order.v1.core.app.core.v2.stream;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.app.core.v2.service.IAppCoreV2CoreService;

import com.abcd.uop.model.Order;
import brave.Tracer;

@Component
public class AppCoreV2CoreSplitLineItemsStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.splitlineitems.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAppCoreV2CoreService appCoreV2CoreService;

  public AppCoreV2CoreSplitLineItemsStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAppCoreV2CoreService appCoreV2CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.appCoreV2CoreService = appCoreV2CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    List<Order> source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    appCoreV2CoreService.splitLineItems(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
