package demo.order.v1.composite.app.comp.svc.v1.stream;

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
import demo.order.v1.composite.app.comp.svc.v1.IAppCompSvcV1CompositeService;

import com.abcd.uop.model.Order;
import brave.Tracer;

@Component
public class AppCompSvcV1CompositeGroupLogicalShipmentsStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.grouplogicalshipments.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IAppCompSvcV1CompositeService appCompSvcV1CompositeService;

  public AppCompSvcV1CompositeGroupLogicalShipmentsStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IAppCompSvcV1CompositeService appCompSvcV1CompositeService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.appCompSvcV1CompositeService = appCompSvcV1CompositeService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    List<Order> source = jsonUtils.convertFromJson(getPayload(), Order.class);
    getServiceRequestContext().setBody(source);
    appCompSvcV1CompositeService.groupLogicalShipments(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
