package demo.fihub.composite.order.collect.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import demo.fihub.composite.order.collect.v1.model.*;
import demo.fihub.composite.order.collect.v1.IOrderCollectV1CompositeService;

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
@Api("returnsaggregator-service")
@RequiredArgsConstructor
public class OrderCollectV1CompositeServiceController {

  private final IOrderCollectV1CompositeService orderCollectV1CompositeService;

  /** */
  @GetMapping(
      value = "/customerorderdetails/{customerOrderId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "get return orders by customerorderid",
      tags = {"returnsaggregator"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<List<Order>> getReturnsByCustomerOrderId(
      @ApiParam(value = "customerOrderId", required = true)
          @PathVariable(value = "customerOrderId", required = true)
          String customerOrderId) {

    List<Order> data = orderCollectV1CompositeService.getReturnsByCustomerOrderId(customerOrderId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @GetMapping(
      value = "/returndetails/{orderId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "get return orders by orderid",
      tags = {"returnsaggregator"},
      response = OrderTransactions.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<List<OrderTransactions>> getReturnsByOrderId(
      @ApiParam(value = "orderId", required = true)
          @PathVariable(value = "orderId", required = true)
          String orderId) {

    List<OrderTransactions> data = orderCollectV1CompositeService.getReturnsByOrderId(orderId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @PostMapping(
      value = "/Order/remorsetask/invoke",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "process return post Remorse Time",
      tags = {"returnsaggregator"},
      response = Order.class)
  @ApiResponses({
    @ApiResponse(code = 200, message = "OK"),
    @ApiResponse(code = 201, message = "Created")
  })
  public ResponseEntity<Order> publishReturnProcessEvent(
      @ApiParam(value = "Order", required = true) @Validated({CreateGroup.class}) @RequestBody
          Order Order) {

    Order data = orderCollectV1CompositeService.publishReturnProcessEvent(Order);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }

  /** */
  @GetMapping(
      value = "/Order/{OrderId}",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(
      value = "get return order by Orderid",
      tags = {"returnsaggregator"},
      response = Order.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<Order> getReturnByOrderId(
      @ApiParam(value = "OrderId", required = true)
          @PathVariable(value = "OrderId", required = true)
          String OrderId) {

    Order data = orderCollectV1CompositeService.getReturnByOrderId(OrderId);
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
