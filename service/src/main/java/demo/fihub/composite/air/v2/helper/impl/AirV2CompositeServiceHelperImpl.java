package demo.fihub.composite.air.v2.helper.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.macys.order.foundation.core.utils.execution.ServiceExceutionContextUtil;
import demo.fihub.composite.air.v2.helper.IAirV2CompositeServiceHelper;
import demo.fihub.composite.air.v2.model.*;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class AirV2CompositeServiceHelperImpl
    implements IAirV2CompositeServiceHelper, ServiceExceutionContextUtil {

  @Override
  public void processGetAircraftsRequest() {
    // TODO: your code goes here...
    enableServiceCall("qqqq");
  }

  @Override
  public List<Aircraft> processGetAircraftsResponse() {
    // TODO: your code goes here...
    return Collections.emptyList();
  }

  @Override
  public void processPostAircraftsRequest() {
    // TODO: your code goes here...
    enableServiceCall("wwwww");
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
