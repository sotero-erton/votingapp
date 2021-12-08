package br.com.sicredi.VotingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Associados votantes.
 */
@Entity
@Table(name = "VotingAssociates")
@ApiModel(description = "Associados votantes.")
public class VotingAssociate {

    @Id
    @JsonProperty("id")
    private String id;

    @NotNull(message = "Um Voto é sempre associado a uma Pauta...")
    @ManyToOne
    @JoinColumn(name = "agenda_id")
    @JsonProperty("Agenda")
    private Agenda agenda;

    @NotNull(message = "Um registro de votação deve estar associado ao Cooperado...")
    @ManyToOne
    @JoinColumn(name = "voting_member_id")
    @JsonProperty("votingMember")
    private Associate votingMember;

    public VotingAssociate id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @ApiModelProperty(value = "")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VotingAssociate agenda(Agenda agenda) {
        this.agenda = agenda;
        return this;
    }

    /**
     * Get agenda
     *
     * @return agenda
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public VotingAssociate votingMember(Associate votingMember) {
        this.votingMember = votingMember;
        return this;
    }

    /**
     * Get votingMember
     *
     * @return votingMember
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Associate getVotingMember() {
        return votingMember;
    }

    public void setVotingMember(Associate votingMember) {
        this.votingMember = votingMember;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VotingAssociate votingAssociate = (VotingAssociate) o;
        return Objects.equals(this.id, votingAssociate.id) &&
                Objects.equals(this.agenda, votingAssociate.agenda) &&
                Objects.equals(this.votingMember, votingAssociate.votingMember);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agenda, votingMember);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VotingAssociate {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
        sb.append("    votingMember: ").append(toIndentedString(votingMember)).append("\n");
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

