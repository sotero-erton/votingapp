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
public class MyAgendas {
  @JsonProperty("id")
  private String id;

  @JsonProperty("description")
  private String description;

  @JsonProperty("status")
  private String status;

  @JsonProperty("start-date")
  private String startDate;

  @JsonProperty("start-time")
  private String startTime;

  @JsonProperty("end-date")
  private String endDate;

  @JsonProperty("end-time")
  private String endTime;

  @JsonProperty("votes-yes")
  private String votesYes;

  @JsonProperty("votes-no")
  private String votesNo;

  public MyAgendas id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Descrição da Pauta.
   * @return id
  */
  @ApiModelProperty(value = "Descrição da Pauta.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MyAgendas description(String description) {
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

  public MyAgendas status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Situação da Pauta: \"em Votação\", \"Aprovado\", \"Reprovado\" e \"Aguardando\".
   * @return status
  */
  @ApiModelProperty(value = "Situação da Pauta: \"em Votação\", \"Aprovado\", \"Reprovado\" e \"Aguardando\".")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public MyAgendas startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Data de inicio da votação.
   * @return startDate
  */
  @ApiModelProperty(value = "Data de inicio da votação.")


  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public MyAgendas startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Hota de inicio da votação.
   * @return startTime
  */
  @ApiModelProperty(value = "Hota de inicio da votação.")


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public MyAgendas endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Data de termino da votação.
   * @return endDate
  */
  @ApiModelProperty(value = "Data de termino da votação.")


  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public MyAgendas endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Hora de termino da votação.
   * @return endTime
  */
  @ApiModelProperty(value = "Hora de termino da votação.")


  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public MyAgendas votesYes(String votesYes) {
    this.votesYes = votesYes;
    return this;
  }

  /**
   * Número de votos SIM.
   * @return votesYes
  */
  @ApiModelProperty(value = "Número de votos SIM.")


  public String getVotesYes() {
    return votesYes;
  }

  public void setVotesYes(String votesYes) {
    this.votesYes = votesYes;
  }

  public MyAgendas votesNo(String votesNo) {
    this.votesNo = votesNo;
    return this;
  }

  /**
   * Número de votos NÂO.
   * @return votesNo
  */
  @ApiModelProperty(value = "Número de votos NÂO.")


  public String getVotesNo() {
    return votesNo;
  }

  public void setVotesNo(String votesNo) {
    this.votesNo = votesNo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MyAgendas myAgendas = (MyAgendas) o;
    return Objects.equals(this.id, myAgendas.id) &&
        Objects.equals(this.description, myAgendas.description) &&
        Objects.equals(this.status, myAgendas.status) &&
        Objects.equals(this.startDate, myAgendas.startDate) &&
        Objects.equals(this.startTime, myAgendas.startTime) &&
        Objects.equals(this.endDate, myAgendas.endDate) &&
        Objects.equals(this.endTime, myAgendas.endTime) &&
        Objects.equals(this.votesYes, myAgendas.votesYes) &&
        Objects.equals(this.votesNo, myAgendas.votesNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, status, startDate, startTime, endDate, endTime, votesYes, votesNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    votesYes: ").append(toIndentedString(votesYes)).append("\n");
    sb.append("    votesNo: ").append(toIndentedString(votesNo)).append("\n");
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

