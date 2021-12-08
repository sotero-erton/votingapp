package org.openapitools.responses;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Pauta (para lista de votação)
 */
@ApiModel(description = "Pauta (para lista de votação)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-07T20:09:59.297703-03:00[America/Sao_Paulo]")
public class AgendasWaitingVotingSection {
  @JsonProperty("id")
  private String id;

  @JsonProperty("description")
  private String description;

  public AgendasWaitingVotingSection id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da Pauta
   * @return id
  */
  @ApiModelProperty(value = "Identificador da Pauta")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AgendasWaitingVotingSection description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descrição da Pauta de Votação
   * @return description
  */
  @ApiModelProperty(value = "Descrição da Pauta de Votação")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgendasWaitingVotingSection agendasWaitingVotingSection = (AgendasWaitingVotingSection) o;
    return Objects.equals(this.id, agendasWaitingVotingSection.id) &&
        Objects.equals(this.description, agendasWaitingVotingSection.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

