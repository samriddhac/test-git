package demo.blag.core.teast.format.service;

import demo.blag.core.teast.format.model.*;
import java.util.*;

public interface ITeastFormatCoreService {

  List<Schedule> getSchedules();

  Schedule getSchedule(long scheduleId);

  void putSchedule(long scheduleId, Schedule body);

  void deleteSchedule(long scheduleId);
}
