package org.openapitools.responses;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Informações de Acesso e Permissão do usuário
 */
@ApiModel(description = "Informações de Acesso e Permissão do usuário")
public class AccessAndPermissions {
    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("acesso")
    private Boolean acesso;

    @JsonProperty("vote")
    private Boolean vote;

    @JsonProperty("voting-sections")
    private Boolean votingSections;

    public AccessAndPermissions cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    /**
     * CPF do usuário
     *
     * @return cpf
     */
    @ApiModelProperty(value = "CPF do usuário")


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public AccessAndPermissions acesso(Boolean acesso) {
        this.acesso = acesso;
        return this;
    }

    /**
     * Direito de acesso
     *
     * @return acesso
     */
    @ApiModelProperty(value = "Direito de acesso")


    public Boolean getAcesso() {
        return acesso;
    }

    public void setAcesso(Boolean acesso) {
        this.acesso = acesso;
    }

    public AccessAndPermissions vote(Boolean vote) {
        this.vote = vote;
        return this;
    }

    /**
     * Permissão para votar
     *
     * @return vote
     */
    @ApiModelProperty(value = "Permissão para votar")


    public Boolean getVote() {
        return vote;
    }

    public void setVote(Boolean vote) {
        this.vote = vote;
    }

    public AccessAndPermissions votingSections(Boolean votingSections) {
        this.votingSections = votingSections;
        return this;
    }

    /**
     * Permissão de abertura de Seções de Votação
     *
     * @return votingSections
     */
    @ApiModelProperty(value = "Permissão de abertura de Seções de Votação")


    public Boolean getVotingSections() {
        return votingSections;
    }

    public void setVotingSections(Boolean votingSections) {
        this.votingSections = votingSections;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessAndPermissions accessAndPermissions = (AccessAndPermissions) o;
        return Objects.equals(this.cpf, accessAndPermissions.cpf) &&
                Objects.equals(this.acesso, accessAndPermissions.acesso) &&
                Objects.equals(this.vote, accessAndPermissions.vote) &&
                Objects.equals(this.votingSections, accessAndPermissions.votingSections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, acesso, vote, votingSections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InlineResponse200 {\n");

        sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
        sb.append("    acesso: ").append(toIndentedString(acesso)).append("\n");
        sb.append("    vote: ").append(toIndentedString(vote)).append("\n");
        sb.append("    votingSections: ").append(toIndentedString(votingSections)).append("\n");
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

