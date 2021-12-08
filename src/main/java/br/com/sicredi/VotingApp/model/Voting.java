package br.com.sicredi.VotingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.Objects;

/**
 * Votos.
 */
@Entity
@ApiModel(description = "Votos.")
public class Voting {

    @Id
    @JsonProperty("id")
    private String id;

    @NotNull(message = "Um Voto é sempre associado a uma Pauta...")
    @ManyToOne
    @JoinColumn(name = "agenda_id")
    @JsonProperty("Agenda")
    private Agenda agenda;

    @PositiveOrZero(message = "Não existe valor de votação negativo...")
    @Min(message = "Não existe valor de votação negativo...", value = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @JsonProperty("totalVotesYes")
    private Integer totalVotesYes;

    @PositiveOrZero(message = "Não existe valor de votação negativo...")
    @Min(message = "Não existe valor de votação negativo...", value = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @JsonProperty("totalVotesNo")
    private Integer totalVotesNo;

    public void setTotalVotesYes(Integer totalVotesYes) {
        this.totalVotesYes = totalVotesYes;
    }

    public Integer getTotalVotesYes() {
        return totalVotesYes;
    }

    public Voting id(String id) {
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

    public Voting agenda(Agenda agenda) {
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

    public Voting totalVotesYes(Integer totalVotesYes) {
        this.totalVotesYes = totalVotesYes;
        return this;
    }

    public Voting totalVotesNo(Integer totalVotesNo) {
        this.totalVotesNo = totalVotesNo;
        return this;
    }

    /**
     * Total de votos NÃO.
     *
     * @return totalVotesNo
     */
    @ApiModelProperty(value = "Total de votos NÃO.")


    public Integer getTotalVotesNo() {
        return totalVotesNo;
    }

    public void setTotalVotesNo(Integer totalVotesNo) {
        this.totalVotesNo = totalVotesNo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Voting voting = (Voting) o;
        return Objects.equals(this.id, voting.id) &&
                Objects.equals(this.agenda, voting.agenda) &&
                Objects.equals(this.totalVotesYes, voting.totalVotesYes) &&
                Objects.equals(this.totalVotesNo, voting.totalVotesNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agenda, totalVotesYes, totalVotesNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Voting {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
        sb.append("    totalVotesYes: ").append(toIndentedString(totalVotesYes)).append("\n");
        sb.append("    totalVotesNo: ").append(toIndentedString(totalVotesNo)).append("\n");
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

