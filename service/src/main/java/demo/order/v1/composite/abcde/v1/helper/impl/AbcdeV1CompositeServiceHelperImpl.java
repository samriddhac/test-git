package demo.order.v1.composite.abcde.v1.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.abcde.v1.helper.IAbcdeV1CompositeServiceHelper;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AbcdeV1CompositeServiceHelperImpl
    implements IAbcdeV1CompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processGetOrderIdForCustomerOrderIdOrReservationIdRequest() {
    // TODO: your code goes here...
    enableServiceCall("7916fdb4-420f-4f45-9513-2b68f3db9192");
  }

  @Override
  public String processGetOrderIdForCustomerOrderIdOrReservationIdResponse() {
    // TODO: your code goes here...
    return null;
  }
}
