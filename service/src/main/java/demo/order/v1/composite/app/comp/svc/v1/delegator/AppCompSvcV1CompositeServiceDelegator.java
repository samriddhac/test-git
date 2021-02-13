package demo.order.v1.composite.app.comp.svc.v1.delegator;

import com.abcd.uop.model.Order;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.app.comp.svc.v1.IAppCompSvcV1CompositeService;
import demo.order.v1.composite.app.comp.svc.v1.helper.IAppCompSvcV1CompositeServiceHelper;
import demo.order.v1.composite.app.comp.svc.v1.helper.IAppCoreSvcV1CoreServiceHelper;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppCompSvcV1CompositeServiceDelegator
    implements IAppCompSvcV1CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAppCompSvcV1CompositeServiceHelper appCompSvcV1CompositeServiceHelper;

  private final IAppCoreSvcV1CoreServiceHelper appCoreSvcV1CoreServiceHelper;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    appCompSvcV1CompositeServiceHelper.processGroupLogicalShipmentsRequest();
    if (isServiceCallEnabled("e6dddae3-0005-41de-a463-2183b7daa64f")) {
      appCoreSvcV1CoreServiceHelper.groupLogicalShipments("e6dddae3-0005-41de-a463-2183b7daa64f");
    }
    return appCompSvcV1CompositeServiceHelper.processGroupLogicalShipmentsResponse();
  }

  @Override
  public List<List<Order>> splitLineItems(List<Order> lineItemArray) {
    appCompSvcV1CompositeServiceHelper.processSplitLineItemsRequest();
    if (isServiceCallEnabled("1f083ff6-34ce-4555-b2ba-6c92d6551fea")) {
      appCoreSvcV1CoreServiceHelper.splitLineItems("1f083ff6-34ce-4555-b2ba-6c92d6551fea");
    }
    return appCompSvcV1CompositeServiceHelper.processSplitLineItemsResponse();
  }
}
