package demo.blag.core.teast.format.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.validation.constraints.*;
import lombok.Data;

/** Schedule */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Schedule {

  @JsonProperty("id")
  @ApiModelProperty(value = "")
  private Long id = null;

  @JsonProperty("externalIdentifier")
  @ApiModelProperty(value = "")
  private String externalIdentifier = null;

  @JsonProperty("aircraftId")
  @ApiModelProperty(value = "")
  private Integer aircraftId = null;

  @JsonProperty("airlineId")
  @ApiModelProperty(value = "")
  private Integer airlineId = null;

  @JsonProperty("route")
  @ApiModelProperty(value = "")
  private String route = null;

  @JsonProperty("hostScheduledDate")
  @ApiModelProperty(value = "")
  private String hostScheduledDate = null;

  @JsonProperty("hostUTCOffset")
  @ApiModelProperty(value = "")
  private Integer hostUTCOffset = null;

  @JsonProperty("flightType")
  @ApiModelProperty(value = "")
  private String flightType = null;

  @JsonProperty("statusCode")
  @ApiModelProperty(value = "")
  private String statusCode = null;

  @JsonProperty("statusTime")
  @ApiModelProperty(value = "")
  private String statusTime = null;

  @JsonProperty("statusMessage")
  @ApiModelProperty(value = "")
  private String statusMessage = null;

  @JsonProperty("gateNumber")
  @ApiModelProperty(value = "")
  private String gateNumber = null;

  @JsonProperty("flightNumber")
  @ApiModelProperty(value = "")
  private Integer flightNumber = null;

  @JsonProperty("category")
  @ApiModelProperty(value = "")
  private String category = null;

  @JsonProperty("numberOfStops")
  @ApiModelProperty(value = "")
  private Integer numberOfStops = null;

  @JsonProperty("originTerminal")
  @ApiModelProperty(value = "")
  private String originTerminal = null;

  @JsonProperty("destinationTerminal")
  @ApiModelProperty(value = "")
  private String destinationTerminal = null;

  @JsonProperty("originAirportId")
  @ApiModelProperty(value = "")
  private Integer originAirportId = null;

  @JsonProperty("destinationAirportId")
  @ApiModelProperty(value = "")
  private Integer destinationAirportId = null;

  @JsonProperty("stopOverId")
  @ApiModelProperty(value = "")
  private List<Integer> stopOverId = null;

  @JsonProperty("durationInMinutes")
  @ApiModelProperty(value = "")
  private Integer durationInMinutes = null;

  @JsonProperty("otherScheduledDate")
  @ApiModelProperty(value = "")
  private String otherScheduledDate = null;

  @JsonProperty("otherUTCOffset")
  @ApiModelProperty(value = "")
  private Integer otherUTCOffset = null;

  @JsonProperty("statusUpdateDateTime")
  @ApiModelProperty(value = "")
  private String statusUpdateDateTime = null;
}
