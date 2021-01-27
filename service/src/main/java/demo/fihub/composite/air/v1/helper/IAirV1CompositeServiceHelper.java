package demo.fihub.composite.air.v1.helper;

import java.util.List;
import demo.fihub.composite.air.v1.model.*;

public interface IAirV1CompositeServiceHelper {

  public void processGetAircraftsRequest();

  public List<Aircraft> processGetAircraftsResponse();

  public void processPostAircraftsRequest();

  public void processPostAircraftsResponse();

  public void processGetAircraftRequest();

  public Aircraft processGetAircraftResponse();

  public void processPutAircraftRequest();

  public void processPutAircraftResponse();

  public void processDeleteAircraftRequest();

  public void processDeleteAircraftResponse();
}
