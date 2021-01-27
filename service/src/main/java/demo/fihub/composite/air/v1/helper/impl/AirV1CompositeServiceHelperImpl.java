package demo.fihub.composite.air.v1.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import demo.fihub.composite.air.v1.helper.IAirV1CompositeServiceHelper;
import demo.fihub.composite.air.v1.model.*;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AirV1CompositeServiceHelperImpl
    implements IAirV1CompositeServiceHelper, ServiceExceutionContextUtil {

  @Override
  public void processGetAircraftsRequest() {
    // TODO: your code goes here...
    enableServiceCall("a-v1-0");
  }

  @Override
  public List<Aircraft> processGetAircraftsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public void processPostAircraftsRequest() {
    // TODO: your code goes here...
    enableServiceCall("a-v1-1");
  }

  @Override
  public void processPostAircraftsResponse() {
    // TODO: your code goes here...
  }

  @Override
  public void processGetAircraftRequest() {
    // TODO: your code goes here...
  }

  @Override
  public Aircraft processGetAircraftResponse() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void processPutAircraftRequest() {
    // TODO: your code goes here...
  }

  @Override
  public void processPutAircraftResponse() {
    // TODO: your code goes here...
  }

  @Override
  public void processDeleteAircraftRequest() {
    // TODO: your code goes here...
  }

  @Override
  public void processDeleteAircraftResponse() {
    // TODO: your code goes here...
  }
}
