package demo.order.v1.core.shipment.v6.stream;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;

import com.google.pubsub.v1.PubsubMessage;
import com.macys.mst.order.foundation.core.utils.execution.ServiceContextUtil;
import com.macys.mst.order.foundation.core.utils.json.JsonUtils;
import com.macys.mst.order.foundation.core.utils.logging.Logger;
import com.macys.mst.order.foundation.core.utils.message.validation.MessageValidator;
import com.macys.mst.order.foundation.core.utils.msg.subscriber.AbstractStreamSubscriber;
import demo.order.v1.core.shipment.v6.service.IShipmentV6CoreService;

import brave.Tracer;

@Component
public class ShipmentV6CoreCreateShipmentStream extends AbstractStreamSubscriber
    implements ServiceContextUtil {

  @Value("${topic.subscription.createshipment.name}")
  private String subscriptionName;

  private final JsonUtils jsonUtils;

  private final IShipmentV6CoreService shipmentV6CoreService;

  public ShipmentV6CoreCreateShipmentStream(
      PubSubTemplate pubSubTemplate,
      MessageValidator messageValidator,
      JsonUtils jsonUtils,
      Logger logger,
      Tracer tracer,
      IShipmentV6CoreService shipmentV6CoreService) {
    super(pubSubTemplate, messageValidator, logger, tracer);
    this.shipmentV6CoreService = shipmentV6CoreService;
    this.jsonUtils = jsonUtils;
  }

  @Override
  protected void invokeService(PubsubMessage message) {
    com.abcd.uop.model.Order source =
        jsonUtils.convertFromJson(getPayload(), com.abcd.uop.model.Order.class);
    getServiceRequestContext().setBody(source);
    shipmentV6CoreService.createShipment(source);
  }

  @Override
  protected String getTopicSubscription() {
    return subscriptionName;
  }
}
