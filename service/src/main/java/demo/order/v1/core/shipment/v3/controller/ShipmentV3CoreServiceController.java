package demo.order.v1.core.shipment.v3.controller;

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

import com.macys.mst.order.foundation.core.utils.validation.CreateGroup;
import com.macys.mst.order.foundation.core.utils.validation.UpdateGroup;
import com.abcd.uop.model.BadOrder;
import demo.order.v1.core.shipment.v3.service.ShipmentV3CoreService;

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
public class ShipmentV3CoreServiceController {

  private final ShipmentV3CoreService shipmentV3CoreService;

  /** */
  @PostMapping(
      value = "/op/v1/order/shipment/create",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.ALL_VALUE})
  @ApiOperation(
      value = "createShipment",
      tags = {"shipment"},
      response = com.abcd.uop.model.Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<com.abcd.uop.model.Order> createShipment(
      @ApiParam(value = "shipmentRequest", required = true)
          @Validated({CreateGroup.class})
          @RequestBody
          com.abcd.uop.model.Order shipmentRequest) {
    com.abcd.uop.model.Order data = shipmentV3CoreService.createShipment(shipmentRequest);
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
      response = com.abcd.uop.returning.model.Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<com.abcd.uop.returning.model.Order> getAllShipmentByPONumber(
      @ApiParam(value = "poNumber", required = true)
          @PathVariable(value = "ponumber", required = true)
          String ponumber,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    com.abcd.uop.returning.model.Order data =
        shipmentV3CoreService.getAllShipmentByPONumber(ponumber);
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
      response = com.abcd.uop.model.Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<com.abcd.uop.model.Order> getShipmentByShipmentRef(
      @ApiParam(value = "shipmentRef", required = true)
          @PathVariable(value = "shipmentref", required = true)
          String shipmentref,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    com.abcd.uop.model.Order data = shipmentV3CoreService.getShipmentByShipmentRef(shipmentref);
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
      response = com.abcd.uop.model.Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<com.abcd.uop.model.Order> getAllShipmentByOrderId(
      @ApiParam(value = "shipmentOrderId", required = true)
          @PathVariable(value = "shipmentorderid", required = true)
          String shipmentorderid,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    com.abcd.uop.model.Order data = shipmentV3CoreService.getAllShipmentByOrderId(shipmentorderid);
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
      response = com.abcd.uop.model.Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<com.abcd.uop.model.Order> updateShipment(
      @ApiParam(value = "shipmentRequest", required = true)
          @Validated({UpdateGroup.class})
          @RequestBody
          com.abcd.uop.model.Order shipmentRequest) {
    com.abcd.uop.model.Order data = shipmentV3CoreService.updateShipment(shipmentRequest);
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
      response = BadOrder.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<BadOrder> getShipmentByShipmentId(
      @ApiParam(value = "shipmentId", required = true)
          @PathVariable(value = "shipmentid", required = true)
          int shipmentid,
      @ApiParam(value = "shipmentOrderId", required = true)
          @PathVariable(value = "shipmentorderid", required = true)
          String shipmentorderid,
      @ApiParam(value = "filter", required = false) @RequestParam(value = "filter", required = true)
          boolean filter) {
    BadOrder data = shipmentV3CoreService.getShipmentByShipmentId(shipmentid, shipmentorderid);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
