package demo.order.v1.composite.test.v2.comp.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.mst.order.foundation.core.utils.execution.ServiceExecutionContextUtil;
import demo.order.v1.composite.test.v2.comp.helper.ITestV2CompCompositeServiceHelper;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class TestV2CompCompositeServiceHelperImpl
    implements ITestV2CompCompositeServiceHelper, ServiceExecutionContextUtil {

  @Override
  public void processCollectOrderRequest() {
    // TODO: your code goes here...
    enableServiceCall("6f706809-efd9-4ac0-965f-c515682cecdd");
  }

  @Override
  public com.abcd.uop.model.Order processCollectOrderResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processUpdateOrderRequest() {
    // TODO: your code goes here...
    enableServiceCall("10979ed2-f270-4b3b-9c1e-aface3b5ac14");
  }

  @Override
  public com.abcd.oop.model.Order processUpdateOrderResponse() {
    // TODO: your code goes here...
    return null;
  }
}
