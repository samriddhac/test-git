package demo.order.v1.composite.shipment.v2.comp.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.composite.shipment.v2.comp.IShipmentV2CompCompositeService;

import brave.Tracer;

@Component
public class ShipmentV2CompCompositeUpdateShipmentStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.updateshipment.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IShipmentV2CompCompositeService shipmentV2CompCompositeService;

  public ShipmentV2CompCompositeUpdateShipmentStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IShipmentV2CompCompositeService shipmentV2CompCompositeService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.shipmentV2CompCompositeService = shipmentV2CompCompositeService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    com.abcd.uop.model.Order source =
        jsonUtils.convertFromJson(getPayload(), com.abcd.uop.model.Order.class);
    getServiceRequestContext().setBody(source);
    shipmentV2CompCompositeService.updateShipment(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
