package demo.order.v1.composite.abcde.v1.delegator;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import com.macys.mst.order.foundation.core.utils.future.FutureUtils;
import demo.order.v1.composite.abcde.v1.IAbcdeV1CompositeService;
import demo.order.v1.composite.abcde.v1.helper.IAbcdV1CoreServiceHelper;
import demo.order.v1.composite.abcde.v1.helper.IAbcdeV1CompositeServiceHelper;
import java.lang.Override;
import java.lang.String;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AbcdeV1CompositeServiceDelegator
    implements IAbcdeV1CompositeService, ServiceExecutionContextUtil {
  private final FutureUtils futureUtils;

  private final IAbcdeV1CompositeServiceHelper abcdeV1CompositeServiceHelper;

  private final IAbcdV1CoreServiceHelper abcdV1CoreServiceHelper;

  @Override
  public String getOrderIdForCustomerOrderIdOrReservationId() {
    abcdeV1CompositeServiceHelper.processGetOrderIdForCustomerOrderIdOrReservationIdRequest();
    if (isServiceCallEnabled("7916fdb4-420f-4f45-9513-2b68f3db9192")) {
      abcdV1CoreServiceHelper.getOrderIdForCustomerOrderIdOrReservationId(
          "7916fdb4-420f-4f45-9513-2b68f3db9192");
    }
    return abcdeV1CompositeServiceHelper
        .processGetOrderIdForCustomerOrderIdOrReservationIdResponse();
  }
}
