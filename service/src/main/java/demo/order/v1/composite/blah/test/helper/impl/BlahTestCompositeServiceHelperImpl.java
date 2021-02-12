package demo.order.v1.composite.blah.test.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.blah.test.helper.IBlahTestCompositeServiceHelper;
import com.abcd.uop.model.Order;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class BlahTestCompositeServiceHelperImpl
    implements IBlahTestCompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processCollectOrderRequest() {
    // TODO: your code goes here...
    enableServiceCall("ddc92429-5877-4e6c-bbd1-dd922a34cd8e");
  }

  @Override
  public Order processCollectOrderResponse() {
    // TODO: your code goes here...
    return null;
  }
}
