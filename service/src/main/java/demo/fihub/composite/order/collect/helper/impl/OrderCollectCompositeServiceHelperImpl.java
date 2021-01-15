package demo.fihub.composite.order.collect.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import com.macys.order.foundation.core.utils.execution.StreamContextUtil;
import com.macys.order.foundation.core.utils.json.JsonUtils;
import demo.fihub.composite.order.collect.helper.IOrderCollectCompositeServiceHelper;
import demo.fihub.composite.order.collect.model.*;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class OrderCollectCompositeServiceHelperImpl
    implements IOrderCollectCompositeServiceHelper, ServiceExceutionContextUtil, StreamContextUtil {

  private final JsonUtils jsonUtils;

  @Override
  public void processGetReturnsByCustomerOrderIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("8c881c16-24e3-421c-a685-d218f4565a22");
  }

  @Override
  public List<Order> processGetReturnsByCustomerOrderIdResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public void processGetReturnsByOrderIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("jgjgjgjgjgjgjgjgjgjgjgjg");
  }

  @Override
  public List<OrderTransactions> processGetReturnsByOrderIdResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public void processPublishReturnProcessEventRequest() {
    // TODO: your code goes here...
  }

  @Override
  public Order processPublishReturnProcessEventResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processGetReturnByOrderIdRequest() {
    // TODO: your code goes here...
  }

  @Override
  public Order processGetReturnByOrderIdResponse() {
    // TODO: your code goes here...
    return null;
  }
}
