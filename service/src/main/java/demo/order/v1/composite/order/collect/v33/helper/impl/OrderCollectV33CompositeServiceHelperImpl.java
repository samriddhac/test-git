package demo.order.v1.composite.order.collect.v33.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.order.collect.v33.helper.IOrderCollectV33CompositeServiceHelper;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OrderCollectV33CompositeServiceHelperImpl
    implements IOrderCollectV33CompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processCollectOrderRequest() {
    // TODO: your code goes here...
    enableServiceCall("6bd44e49-51b1-44b6-bd11-484db148105e");
  }

  @Override
  public com.abcd.uop.model.Order processCollectOrderResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processUpdateOrderRequest() {
    // TODO: your code goes here...
    enableServiceCall("f612fbaf-f3d5-41d6-8a66-3dd7183ea1b1");
  }

  @Override
  public com.abcd.oop.model.Order processUpdateOrderResponse() {
    // TODO: your code goes here...
    return null;
  }
}
