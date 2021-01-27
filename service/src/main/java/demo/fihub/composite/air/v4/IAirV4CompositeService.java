package demo.fihub.composite.air.v4;

import java.util.List;
import demo.fihub.composite.air.v4.model.*;

/** */
public interface IAirV4CompositeService {

  public List<Aircraft> getAircrafts();

  void postAircrafts(Aircraft body);

  public Aircraft getAircraft(long aircraftId);

  void putAircraft(long aircraftId, Aircraft body);

  void deleteAircraft(long aircraftId);
}
