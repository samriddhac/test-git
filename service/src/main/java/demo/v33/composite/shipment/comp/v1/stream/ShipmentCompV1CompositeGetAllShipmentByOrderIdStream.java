package demo.v33.composite.shipment.comp.v1.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import demo.com.framework.core.utils.execution.ServiceContextUtil;
import demo.com.framework.core.utils.json.JsonUtils;
import demo.com.framework.core.utils.logging.Logger;
import demo.com.framework.core.utils.message.validation.MessageValidator;
import demo.com.framework.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.v33.composite.shipment.comp.v1.IShipmentCompV1CompositeService;

import brave.Tracer;

@Component
public class ShipmentCompV1CompositeGetAllShipmentByOrderIdStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.getallshipmentbyorderid.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IShipmentCompV1CompositeService shipmentCompV1CompositeService;

  public ShipmentCompV1CompositeGetAllShipmentByOrderIdStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IShipmentCompV1CompositeService shipmentCompV1CompositeService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.shipmentCompV1CompositeService = shipmentCompV1CompositeService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    com.abcd.uop.model.Order source =
        jsonUtils.convertFromJson(getPayload(), com.abcd.uop.model.Order.class);
    getServiceRequestContext().setBody(source);
    shipmentCompV1CompositeService.getAllShipmentByOrderId(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
