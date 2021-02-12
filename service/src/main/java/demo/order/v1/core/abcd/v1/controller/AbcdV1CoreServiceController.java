package demo.order.v1.core.abcd.v1.controller;

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
import demo.order.v1.core.abcd.v1.service.AbcdV1CoreService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;

/** */
@RestController
@Api("order-core-service")
@RequiredArgsConstructor
public class AbcdV1CoreServiceController {

  private final AbcdV1CoreService abcdV1CoreService;

  /** */
  @GetMapping(
      value = "/op/v1/order/orderid",
      consumes = {MediaType.APPLICATION_JSON_VALUE},
      produces = {MediaType.APPLICATION_JSON_VALUE})
  @ApiOperation(value = "", tags = "", response = String.class)
  @ApiResponses({@ApiResponse(code = 200, message = "OK")})
  public ResponseEntity<String> getOrderIdForCustomerOrderIdOrReservationId(
      @ApiParam(value = "customerOrderId", required = false)
          @RequestParam(value = "customerOrderId", required = true)
          String customerOrderId,
      @ApiParam(value = "reservationId", required = false)
          @RequestParam(value = "reservationId", required = true)
          String reservationId) {
    String data = abcdV1CoreService.getOrderIdForCustomerOrderIdOrReservationId();
    if (data != null) {
      return new ResponseEntity<>(data, HttpStatus.OK);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
  }
}
