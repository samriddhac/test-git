package demo.blag.core.teast.format.dao.impl;

import demo.blag.core.teast.format.dao.TeastFormatCoreDao;
import demo.blag.core.teast.format.model.*;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gcp.data.spanner.core.SpannerTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TeastFormatCoreDaoImpl implements TeastFormatCoreDao {

  private final SpannerTemplate spannerTemplate;

  public List<Schedule> getSchedules() {
    // TODO: your code goes here...
    return null;
  }

  public Schedule getSchedule(long scheduleId) {
    // TODO: your code goes here...
    return null;
  }

  public void putSchedule(long scheduleId, Schedule body) {
    // TODO: your code goes here...
  }

  public void deleteSchedule(long scheduleId) {
    // TODO: your code goes here...
  }
}
