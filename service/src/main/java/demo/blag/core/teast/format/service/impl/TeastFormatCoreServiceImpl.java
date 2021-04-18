package demo.blag.core.teast.format.service.impl;

import demo.blag.core.teast.format.dao.TeastFormatCoreDao;
import demo.blag.core.teast.format.model.*;
import demo.blag.core.teast.format.service.TeastFormatCoreService;
import java.util.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeastFormatCoreServiceImpl implements TeastFormatCoreService {

  private final TeastFormatCoreDao teastFormatCoreDao;

  @Override
  public List<Schedule> getSchedules() {
    // HINT: your code goes here...
    return teastFormatCoreDao.getSchedules();
  }

  @Override
  public Schedule getSchedule(long scheduleId) {
    // HINT: your code goes here...
    return teastFormatCoreDao.getSchedule(scheduleId);
  }

  public void putSchedule(long scheduleId, Schedule body) {
    // HINT: your code goes here...
    teastFormatCoreDao.putSchedule(scheduleId, body);
  }

  public void deleteSchedule(long scheduleId) {
    // HINT: your code goes here...
    teastFormatCoreDao.deleteSchedule(scheduleId);
  }
}
