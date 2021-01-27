package demo.fihub.composite.air.v4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import demo.fihub.composite.air.v4.model.*;
import demo.fihub.composite.air.v4.IAirV4CompositeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.macys.order.foundation.core.utils.validation.CreateGroup;
import com.macys.order.foundation.core.utils.validation.UpdateGroup;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
/** */
@RestController
@Api("aircraft-service")
@RequiredArgsConstructor
public class AirV4CompositeServiceController {

  private final IAirV4CompositeService airV4CompositeService;

  /** */
  @GetMapping(
      value = "/aircrafts",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Aircraft.class)
  @ApiResponses({@ApiResponse(code = 200, message = "success")})
  public ResponseEntity<List<Aircraft>> getAircrafts() {

    List<Aircraft> data = airV4CompositeService.getAircrafts();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @PostMapping(
      value = "/aircrafts",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 201, message = "success")})
  public ResponseEntity<Void> postAircrafts(
      @ApiParam(value = "", required = true) @Validated({CreateGroup.class}) @RequestBody
          Aircraft body) {

    airV4CompositeService.postAircrafts(body);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  /** */
  @GetMapping(
      value = "/aircrafts/{aircraftId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Aircraft.class)
  @ApiResponses({@ApiResponse(code = 200, message = "success")})
  public ResponseEntity<Aircraft> getAircraft(
      @ApiParam(value = "", required = true) @PathVariable(value = "aircraftId", required = true)
          long aircraftId) {

    Aircraft data = airV4CompositeService.getAircraft(aircraftId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @PutMapping(
      value = "/aircrafts/{aircraftId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 204, message = "success")})
  public ResponseEntity<Void> putAircraft(
      @ApiParam(value = "", required = true) @PathVariable(value = "aircraftId", required = true)
          long aircraftId,
      @ApiParam(value = "", required = true) @Validated({UpdateGroup.class}) @RequestBody
          Aircraft body) {

    airV4CompositeService.putAircraft(aircraftId, body);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  /** */
  @DeleteMapping(
      value = "/aircrafts/{aircraftId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 204, message = "success")})
  public ResponseEntity<Void> deleteAircraft(
      @ApiParam(value = "", required = true) @PathVariable(value = "aircraftId", required = true)
          long aircraftId) {

    airV4CompositeService.deleteAircraft(aircraftId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
