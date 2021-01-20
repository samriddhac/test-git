package demo.fihub.core.test.branch.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zalando.problem.Problem;
import org.zalando.problem.Status;

import com.macys.order.foundation.core.utils.validation.CreateGroup;
import com.macys.order.foundation.core.utils.validation.UpdateGroup;
import demo.fihub.core.test.branch.model.*;
import demo.fihub.core.test.branch.service.TestBranchCoreService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

/** */
@RestController
@Api("airport-service")
@RequiredArgsConstructor
public class TestBranchCoreServiceController {

  private final TestBranchCoreService testBranchCoreService;

  /** */
  @GetMapping(
      value = "/airports",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Airport.class)
  @ApiResponses({@ApiResponse(code = 200, message = "success")})
  public ResponseEntity<List<Airport>> getAirports() {

    List<Airport> data = testBranchCoreService.getAirports();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @PostMapping(
      value = "/airports",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 201, message = "success")})
  public ResponseEntity<Void> postAirports(
      @ApiParam(value = "", required = true) @Validated({CreateGroup.class}) @RequestBody
          Airport body) {
    testBranchCoreService.postAirports(body);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }
  /** */
  @GetMapping(
      value = "/airports/{airportId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Airport.class)
  @ApiResponses({@ApiResponse(code = 200, message = "success")})
  public ResponseEntity<Airport> getAirport(
      @ApiParam(value = "", required = true) @PathVariable(value = "airportId", required = true)
          long airportId) {
    Airport data = testBranchCoreService.getAirport(airportId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @PutMapping(
      value = "/airports/{airportId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 204, message = "success")})
  public ResponseEntity<Void> putAirport(
      @ApiParam(value = "", required = true) @PathVariable(value = "airportId", required = true)
          long airportId,
      @ApiParam(value = "", required = true) @Validated({UpdateGroup.class}) @RequestBody
          Airport body) {
    testBranchCoreService.putAirport(airportId, body);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
  /** */
  @DeleteMapping(
      value = "/airports/{airportId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = Void.class)
  @ApiResponses({@ApiResponse(code = 204, message = "success")})
  public ResponseEntity<Void> deleteAirport(
      @ApiParam(value = "", required = true) @PathVariable(value = "airportId", required = true)
          long airportId) {
    testBranchCoreService.deleteAirport(airportId);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
