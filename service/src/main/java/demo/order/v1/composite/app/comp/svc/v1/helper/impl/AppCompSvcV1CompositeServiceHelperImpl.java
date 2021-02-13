package demo.order.v1.composite.app.comp.svc.v1.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.app.comp.svc.v1.helper.IAppCompSvcV1CompositeServiceHelper;
import com.abcd.uop.model.Order;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AppCompSvcV1CompositeServiceHelperImpl
    implements IAppCompSvcV1CompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processGroupLogicalShipmentsRequest() {
    // TODO: your code goes here...
    enableServiceCall("e6dddae3-0005-41de-a463-2183b7daa64f");
  }

  @Override
  public List<List<Order>> processGroupLogicalShipmentsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public void processSplitLineItemsRequest() {
    // TODO: your code goes here...
    enableServiceCall("1f083ff6-34ce-4555-b2ba-6c92d6551fea");
  }

  @Override
  public List<List<Order>> processSplitLineItemsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }
}
