package demo.fihub.composite.air.v1;

import java.util.List;
import demo.fihub.composite.air.v1.model.*;

/** */
public interface IAirV1CompositeService {

  public List<Aircraft> getAircrafts();

  void postAircrafts(Aircraft body);

  public Aircraft getAircraft(long aircraftId);

  void putAircraft(long aircraftId, Aircraft body);

  void deleteAircraft(long aircraftId);
}
