package demo.fihub.core.order.id.v5.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * StopOverAirport
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class StopOverAirport {

    @JsonProperty("iataCode")
    @ApiModelProperty(value = "")
    private String iataCode = null;

    @JsonProperty("name")
    @ApiModelProperty(value = "")
    private String name = null;

    @JsonProperty("cityIataCode")
    @ApiModelProperty(value = "")
    private String cityIataCode = null;

    @JsonProperty("cityName")
    @ApiModelProperty(value = "")
    private String cityName = null;

    @JsonProperty("countryIataCode")
    @ApiModelProperty(value = "")
    private String countryIataCode = null;

    @JsonProperty("countryName")
    @ApiModelProperty(value = "")
    private String countryName = null;
}
