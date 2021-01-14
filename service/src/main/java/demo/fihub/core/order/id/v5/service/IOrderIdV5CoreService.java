package demo.fihub.core.order.id.v5.service;

import java.util.*;
import demo.fihub.core.order.id.v5.model.*;

public interface IOrderIdV5CoreService {

  List<FlightInfo> getFlights();

  FlightInfo getFlight(long id);

  String getHealth();
}
