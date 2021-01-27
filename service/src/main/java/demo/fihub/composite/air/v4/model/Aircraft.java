/*
 * aircraft-service
 * api.description
 *
 * OpenAPI spec version: 1.0
 * Contact: api@demo.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package demo.fihub.composite.air.v4.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Aircraft
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2021-01-27T17:48:56.996+05:30")
public class Aircraft   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("iata")
  private String iata = null;

  @JsonProperty("icao")
  private String icao = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("category")
  private String category = null;

  public Aircraft id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Aircraft iata(String iata) {
    this.iata = iata;
    return this;
  }

  /**
   * Get iata
   * @return iata
   **/
  @JsonProperty("iata")
  @ApiModelProperty(value = "")
  public String getIata() {
    return iata;
  }

  public void setIata(String iata) {
    this.iata = iata;
  }

  public Aircraft icao(String icao) {
    this.icao = icao;
    return this;
  }

  /**
   * Get icao
   * @return icao
   **/
  @JsonProperty("icao")
  @ApiModelProperty(value = "")
  public String getIcao() {
    return icao;
  }

  public void setIcao(String icao) {
    this.icao = icao;
  }

  public Aircraft description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @JsonProperty("description")
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Aircraft type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty("type")
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Aircraft category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
   **/
  @JsonProperty("category")
  @ApiModelProperty(value = "")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aircraft aircraft = (Aircraft) o;
    return Objects.equals(this.id, aircraft.id) &&
        Objects.equals(this.iata, aircraft.iata) &&
        Objects.equals(this.icao, aircraft.icao) &&
        Objects.equals(this.description, aircraft.description) &&
        Objects.equals(this.type, aircraft.type) &&
        Objects.equals(this.category, aircraft.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iata, icao, description, type, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aircraft {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iata: ").append(toIndentedString(iata)).append("\n");
    sb.append("    icao: ").append(toIndentedString(icao)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

