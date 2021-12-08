package org.openapitools.responses;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pauta
 */
@ApiModel(description = "Pauta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-07T20:09:59.297703-03:00[America/Sao_Paulo]")
public class VotingAgendas {
  @JsonProperty("id")
  private String id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("closing-date")
  private String closingDate;

  @JsonProperty("closing-time")
  private String closingTime;

  public VotingAgendas id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VotingAgendas description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descrição da Pauta
   * @return description
  */
  @ApiModelProperty(value = "Descrição da Pauta")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public VotingAgendas closingDate(String closingDate) {
    this.closingDate = closingDate;
    return this;
  }

  /**
   * Data de fechamento da Seção de Votação
   * @return closingDate
  */
  @ApiModelProperty(value = "Data de fechamento da Seção de Votação")


  public String getClosingDate() {
    return closingDate;
  }

  public void setClosingDate(String closingDate) {
    this.closingDate = closingDate;
  }

  public VotingAgendas closingTime(String closingTime) {
    this.closingTime = closingTime;
    return this;
  }

  /**
   * Hora de fechamento da Seção de Votação
   * @return closingTime
  */
  @ApiModelProperty(value = "Hora de fechamento da Seção de Votação")


  public String getClosingTime() {
    return closingTime;
  }

  public void setClosingTime(String closingTime) {
    this.closingTime = closingTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VotingAgendas votingAgendas = (VotingAgendas) o;
    return Objects.equals(this.id, votingAgendas.id) &&
        Objects.equals(this.description, votingAgendas.description) &&
        Objects.equals(this.closingDate, votingAgendas.closingDate) &&
        Objects.equals(this.closingTime, votingAgendas.closingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, closingDate, closingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    closingDate: ").append(toIndentedString(closingDate)).append("\n");
    sb.append("    closingTime: ").append(toIndentedString(closingTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

