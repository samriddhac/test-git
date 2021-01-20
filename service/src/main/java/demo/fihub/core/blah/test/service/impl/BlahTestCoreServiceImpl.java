package demo.fihub.core.blah.test.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.blah.test.model.*;
import demo.fihub.core.blah.test.service.BlahTestCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BlahTestCoreServiceImpl implements BlahTestCoreService {

  @Override
  public List<Airport> getAirports() {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void postAirports(Airport body) {
    // TODO: your code goes here...
  }

  @Override
  public Airport getAirport(long airportId) {
    // TODO: your code goes here...
    return null;
  }

  @Override
  public void putAirport(long airportId, Airport body) {
    // TODO: your code goes here...
  }

  @Override
  public void deleteAirport(long airportId) {
    // TODO: your code goes here...
  }
}
