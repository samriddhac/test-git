package demo.v33.composite.releasegroup.comp.v1.delegator;

import com.abcd.uop.model.Order;
import demo.com.framework.core.utils.execution.ServiceExecutionContextUtil;
import demo.com.framework.core.utils.future.FutureUtils;
import demo.v33.composite.releasegroup.comp.v1.IReleasegroupCompV1CompositeService;
import demo.v33.composite.releasegroup.comp.v1.helper.IReleasegroupCompV1CompositeServiceHelper;
import demo.v33.composite.releasegroup.comp.v1.helper.IReleasegroupV1CoreServiceHelper;
import java.lang.Override;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ReleasegroupCompV1CompositeServiceDelegator
    implements IReleasegroupCompV1CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IReleasegroupCompV1CompositeServiceHelper releasegroupCompV1CompositeServiceHelper;

  private final IReleasegroupV1CoreServiceHelper releasegroupV1CoreServiceHelper;

  @Override
  public void groupLogicalShipments(List<Order> lineItemArray) {
    releasegroupCompV1CompositeServiceHelper.processGroupLogicalShipmentsRequest();
    if (isServiceCallEnabled("c8f4f628-fdd8-45ee-a65f-193c04713085")) {
      releasegroupV1CoreServiceHelper.groupLogicalShipments("c8f4f628-fdd8-45ee-a65f-193c04713085");
    }
    releasegroupCompV1CompositeServiceHelper.processGroupLogicalShipmentsResponse();
  }
}
