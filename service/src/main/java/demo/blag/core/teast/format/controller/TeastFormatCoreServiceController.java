package demo.blag.core.teast.format.controller;

import demo.blag.core.teast.format.model.*;
import demo.blag.core.teast.format.service.TeastFormatCoreService;
import demo.cosmos.core.utils.validation.UpdateGroup;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/** */
@RestController
@Api("schedule-service")
@RequiredArgsConstructor
public class TeastFormatCoreServiceController {

  private final TeastFormatCoreService teastFormatCoreService;

  /** */
  @GetMapping(
      value = "/schedules",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Schedule.class)
  @ApiResponses({@ApiResponse(code = 200, message = "success")})
  public ResponseEntity<List<Schedule>> getSchedules(
      @ApiParam(value = "host scheduled date which by default is current date", required = false)
          @RequestParam(value = "hostScheduledDate", required = true)
          String hostScheduledDate) {
    List<Schedule> data = teastFormatCoreService.getSchedules();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @GetMapping(
      value = "/schedules/{scheduleId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Schedule.class)
  @ApiResponses({@ApiResponse(code = 200, message = "success")})
  public ResponseEntity<Schedule> getSchedule(
      @ApiParam(value = "", required = true) @PathVariable(value = "scheduleId", required = true)
          long scheduleId) {
    Schedule data = teastFormatCoreService.getSchedule(scheduleId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @PutMapping(
      value = "/schedules/{scheduleId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 204, message = "success")})
  public ResponseEntity<Void> putSchedule(
      @ApiParam(value = "", required = true) @PathVariable(value = "scheduleId", required = true)
          long scheduleId,
      @ApiParam(value = "", required = true) @Validated({UpdateGroup.class}) @RequestBody
          Schedule body) {
    teastFormatCoreService.putSchedule(scheduleId, body);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
  /** */
  @DeleteMapping(
      value = "/schedules/{scheduleId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 204, message = "success")})
  public ResponseEntity<Void> deleteSchedule(
      @ApiParam(value = "", required = true) @PathVariable(value = "scheduleId", required = true)
          long scheduleId) {
    teastFormatCoreService.deleteSchedule(scheduleId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
