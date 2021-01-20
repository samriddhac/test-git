package demo.fihub.core.test.branch.service;

import java.util.*;
import demo.fihub.core.test.branch.model.*;

public interface ITestBranchCoreService {

  List<Airport> getAirports();

  void postAirports(Airport body);

  Airport getAirport(long airportId);

  void putAirport(long airportId, Airport body);

  void deleteAirport(long airportId);
}
