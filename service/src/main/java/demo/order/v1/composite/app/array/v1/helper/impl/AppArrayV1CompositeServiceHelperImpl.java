package demo.order.v1.composite.app.array.v1.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.app.array.v1.helper.IAppArrayV1CompositeServiceHelper;
import com.abcd.uop.model.Order;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AppArrayV1CompositeServiceHelperImpl
    implements IAppArrayV1CompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processGroupLogicalShipmentsRequest() {
    // TODO: your code goes here...
    enableServiceCall("1093ad35-bedc-4b87-a08b-4b0d9408e5b5");
  }

  @Override
  public List<List<Order>> processGroupLogicalShipmentsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public void processSplitLineItemsRequest() {
    // TODO: your code goes here...
    enableServiceCall("3b896d32-d510-4775-873f-c7236a22b471");
  }

  @Override
  public List<List<Order>> processSplitLineItemsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }
}
