package demo.fihub.core.order.id.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import demo.fihub.core.order.id.v5.model.StopOverAirport;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * FlightInfo
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FlightInfo {

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

    @JsonProperty("originAirportIataCode")
    @ApiModelProperty(value = "")
    private String originAirportIataCode = null;

    @JsonProperty("originAirportName")
    @ApiModelProperty(value = "")
    private String originAirportName = null;

    @JsonProperty("originCityIataCode")
    @ApiModelProperty(value = "")
    private String originCityIataCode = null;

    @JsonProperty("originCityName")
    @ApiModelProperty(value = "")
    private String originCityName = null;

    @JsonProperty("originCountryIataCode")
    @ApiModelProperty(value = "")
    private String originCountryIataCode = null;

    @JsonProperty("originCountryName")
    @ApiModelProperty(value = "")
    private String originCountryName = null;

    @JsonProperty("destinationAirportIataCode")
    @ApiModelProperty(value = "")
    private String destinationAirportIataCode = null;

    @JsonProperty("destinationAirportName")
    @ApiModelProperty(value = "")
    private String destinationAirportName = null;

    @JsonProperty("destinationCityIataCode")
    @ApiModelProperty(value = "")
    private String destinationCityIataCode = null;

    @JsonProperty("destinationCityName")
    @ApiModelProperty(value = "")
    private String destinationCityName = null;

    @JsonProperty("destinationCountryIataCode")
    @ApiModelProperty(value = "")
    private String destinationCountryIataCode = null;

    @JsonProperty("destinationCountryName")
    @ApiModelProperty(value = "")
    private String destinationCountryName = null;

    @JsonProperty("airlineIataCode")
    @ApiModelProperty(value = "")
    private String airlineIataCode = null;

    @JsonProperty("airlineName")
    @ApiModelProperty(value = "")
    private String airlineName = null;

    @JsonProperty("airlineWebsiteUrl")
    @ApiModelProperty(value = "")
    private String airlineWebsiteUrl = null;

    @JsonProperty("aircraftIataCode")
    @ApiModelProperty(value = "")
    private String aircraftIataCode = null;

    @JsonProperty("aircraftType")
    @ApiModelProperty(value = "")
    private String aircraftType = null;

    @JsonProperty("aircraftCategory")
    @ApiModelProperty(value = "")
    private String aircraftCategory = null;

    @JsonProperty("aircraftDescription")
    @ApiModelProperty(value = "")
    private String aircraftDescription = null;

    @JsonProperty("stopOverAirports")
    @ApiModelProperty(value = "")
    private List<StopOverAirport> stopOverAirports = null;
}
