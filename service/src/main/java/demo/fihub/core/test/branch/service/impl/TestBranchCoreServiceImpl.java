package demo.fihub.core.test.branch.service.impl;

import java.util.*;
import org.springframework.stereotype.Service;
import demo.fihub.core.test.branch.model.*;
import demo.fihub.core.test.branch.service.TestBranchCoreService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestBranchCoreServiceImpl implements TestBranchCoreService {

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
