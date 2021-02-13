package demo.order.v1.composite.app.array.v1.delegator;

import com.abcd.uop.model.Order;
import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.app.array.v1.IAppArrayV1CompositeService;
import demo.order.v1.composite.app.array.v1.helper.IAppArrayV1CompositeServiceHelper;
import demo.order.v1.composite.app.array.v1.helper.IMapperV2CoreServiceHelper;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AppArrayV1CompositeServiceDelegator
    implements IAppArrayV1CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAppArrayV1CompositeServiceHelper appArrayV1CompositeServiceHelper;

  private final IMapperV2CoreServiceHelper mapperV2CoreServiceHelper;

  @Override
  public List<List<Order>> groupLogicalShipments(List<Order> lineItemArray) {
    appArrayV1CompositeServiceHelper.processGroupLogicalShipmentsRequest();
    if (isServiceCallEnabled("1093ad35-bedc-4b87-a08b-4b0d9408e5b5")) {
      mapperV2CoreServiceHelper.groupLogicalShipments("1093ad35-bedc-4b87-a08b-4b0d9408e5b5");
    }
    return appArrayV1CompositeServiceHelper.processGroupLogicalShipmentsResponse();
  }

  @Override
  public List<List<Order>> splitLineItems(List<Order> lineItemArray) {
    appArrayV1CompositeServiceHelper.processSplitLineItemsRequest();
    if (isServiceCallEnabled("3b896d32-d510-4775-873f-c7236a22b471")) {
      mapperV2CoreServiceHelper.splitLineItems("3b896d32-d510-4775-873f-c7236a22b471");
    }
    return appArrayV1CompositeServiceHelper.processSplitLineItemsResponse();
  }
}
