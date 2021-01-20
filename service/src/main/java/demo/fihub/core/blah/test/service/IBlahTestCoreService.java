package demo.fihub.core.blah.test.service;

import java.util.*;
import demo.fihub.core.blah.test.model.*;

public interface IBlahTestCoreService {

  List<Airport> getAirports();

  void postAirports(Airport body);

  Airport getAirport(long airportId);

  void putAirport(long airportId, Airport body);

  void deleteAirport(long airportId);
}
