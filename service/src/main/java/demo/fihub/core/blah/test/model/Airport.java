package demo.fihub.core.blah.test.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Airport
 */
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Airport {

    @JsonProperty("id")
    @ApiModelProperty(value = "")
    private Long id = null;

    @JsonProperty("cityId")
    @ApiModelProperty(value = "")
    private Long cityId = null;

    @JsonProperty("iataCode")
    @ApiModelProperty(value = "")
    private String iataCode = null;

    @JsonProperty("name")
    @ApiModelProperty(value = "")
    private String name = null;

    @JsonProperty("status")
    @ApiModelProperty(value = "")
    private String status = null;

    @JsonProperty("latitude")
    @ApiModelProperty(value = "")
    private Double latitude = null;

    @JsonProperty("longitude")
    @ApiModelProperty(value = "")
    private Double longitude = null;

    @JsonProperty("url")
    @ApiModelProperty(value = "")
    private String url = null;
}
