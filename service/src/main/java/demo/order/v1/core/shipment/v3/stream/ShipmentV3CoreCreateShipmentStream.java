package demo.order.v1.core.shipment.v3.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.shipment.v3.service.IShipmentV3CoreService;

import brave.Tracer;

@Component
public class ShipmentV3CoreCreateShipmentStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.createshipment.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IShipmentV3CoreService shipmentV3CoreService;

  public ShipmentV3CoreCreateShipmentStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IShipmentV3CoreService shipmentV3CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.shipmentV3CoreService = shipmentV3CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    com.abcd.uop.model.Order source =
        jsonUtils.convertFromJson(getPayload(), com.abcd.uop.model.Order.class);
    getServiceRequestContext().setBody(source);
    shipmentV3CoreService.createShipment(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
