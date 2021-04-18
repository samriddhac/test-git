package demo.blag.core.teast.format.dao;

import demo.blag.core.teast.format.model.*;
import java.util.*;

public interface ITeastFormatCoreDao {

  List<Schedule> getSchedules();

  Schedule getSchedule(long scheduleId);

  void putSchedule(long scheduleId, Schedule body);

  void deleteSchedule(long scheduleId);
}
