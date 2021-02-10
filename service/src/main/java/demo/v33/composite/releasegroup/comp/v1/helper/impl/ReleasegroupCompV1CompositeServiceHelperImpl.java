package demo.v33.composite.releasegroup.comp.v1.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import demo.com.framework.core.utils.execution.ServiceExecutionContextUtil;
import demo.v33.composite.releasegroup.comp.v1.helper.IReleasegroupCompV1CompositeServiceHelper;
import com.abcd.uop.model.Order;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ReleasegroupCompV1CompositeServiceHelperImpl
    implements IReleasegroupCompV1CompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processGroupLogicalShipmentsRequest() {
    // TODO: your code goes here...
    enableServiceCall("c8f4f628-fdd8-45ee-a65f-193c04713085");
  }

  @Override
  public List<List<Order>> processGroupLogicalShipmentsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }
}
