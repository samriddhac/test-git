package demo.v33.core.demo.v34.controller;

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

import demo.com.framework.core.utils.validation.CreateGroup;
import demo.com.framework.core.utils.validation.UpdateGroup;
import demo.v33.core.demo.v34.model.*;
import demo.v33.core.demo.v34.service.DemoV34CoreService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

/** */
@RestController
@Api("shipment-service")
@RequiredArgsConstructor
public class DemoV34CoreServiceController {

  private final DemoV34CoreService demoV34CoreService;

  /** */
  @PostMapping(
      value = "/op/v1/order/shipment/create",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.ALL_VALUE})
  @ApiOperation(
      value = "createShipment",
      tags = {"shipment"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> createShipment(
      @ApiParam(value = "shipmentRequest", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          Order shipmentRequest) {
    Order data = demoV34CoreService.createShipment(shipmentRequest);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @GetMapping(
      value = "/op/v1/order/shipments/ponumber/{ponumber} ",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "getAllShipmentByPONumber",
      tags = {"shipment"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> getAllShipmentByPONumber(
      @ApiParam(value = "poNumber", required = true)
          @PathVariable(value = "ponumber", required = true)
          String ponumber,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    Order data = demoV34CoreService.getAllShipmentByPONumber(ponumber);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @GetMapping(
      value = "/op/v1/order/shipments/shipmentref/{shipmentref} ",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "getShipmentByShipmentRef",
      tags = {"shipment"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> getShipmentByShipmentRef(
      @ApiParam(value = "shipmentRef", required = true)
          @PathVariable(value = "shipmentref", required = true)
          String shipmentref,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    Order data = demoV34CoreService.getShipmentByShipmentRef(shipmentref);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @GetMapping(
      value = "/op/v1/order/shipments/{shipmentorderid} ",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "getAllShipmentByOrderId",
      tags = {"shipment"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> getAllShipmentByOrderId(
      @ApiParam(value = "shipmentOrderId", required = true)
          @PathVariable(value = "shipmentorderid", required = true)
          String shipmentorderid,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    Order data = demoV34CoreService.getAllShipmentByOrderId(shipmentorderid);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @PutMapping(
      value = "/op/v1/order/shipment/update",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.ALL_VALUE})
  @ApiOperation(
      value = "updateShipment",
      tags = {"shipment"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> updateShipment(
      @ApiParam(value = "shipmentRequest", required = true)
          @Validated({UpdateGroup.class})
          @RequestBody
          Order shipmentRequest) {
    Order data = demoV34CoreService.updateShipment(shipmentRequest);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
  /** */
  @GetMapping(
      value = "/op/v1/order/shipment/{shipmentorderid}/{shipmentid} ",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "getShipmentByShipmentId",
      tags = {"shipment"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> getShipmentByShipmentId(
      @ApiParam(value = "shipmentId", required = true)
          @PathVariable(value = "shipmentid", required = true)
          int shipmentid,
      @ApiParam(value = "shipmentOrderId", required = true)
          @PathVariable(value = "shipmentorderid", required = true)
          String shipmentorderid,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    Order data = demoV34CoreService.getShipmentByShipmentId(shipmentid, shipmentorderid);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
