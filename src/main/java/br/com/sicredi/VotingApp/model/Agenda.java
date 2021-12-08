package br.com.sicredi.VotingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Pauta de votação.
 */
@Entity
@Table(name = "Agendas")
@ApiModel(description = "Pauta de votação.")
public class Agenda {

    @Id
    @JsonProperty("id")
    private String id;

    @Length(message = "Tamanho de Descrição da Pauta inadequado...", min = 40, max = 60)
    @NotBlank(message = "O campo Descrição não pode ser preenchido por espaços em branco...")
    @NotEmpty(message = "O campo Descrição não pode estar vazio...")
    @NotNull(message = "Campo Descrição não pode ser nulo...")
    @ApiModelProperty(
            notes = "Descrição da Pauta.",
            name = "description", required = true)
    @Column(name = "description", nullable = false, unique = true, length = 60)
    @JsonProperty("description")
    private String description;

    @NotNull(message = "Não pode existir uma Pauta sem um Associado Proponente.")
    @ManyToOne
    @JoinColumn(name = "proposing_associate_id")
    @JsonProperty("proposingAssociate")
    private Associate proposingAssociate;

    public Agenda id(String id) {
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

    public Agenda descrption(String descrption) {
        this.description = descrption;
        return this;
    }

    /**
     * Descrição da Pauta.
     *
     * @return descrption
     */
    @ApiModelProperty(required = true, value = "Descrição da Pauta.")
    @NotNull


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Agenda proposingAssociate(Associate proposingAssociate) {
        this.proposingAssociate = proposingAssociate;
        return this;
    }

    /**
     * Get proposingAssociate
     *
     * @return proposingAssociate
     */
    @ApiModelProperty(value = "")
    @Valid
    public Associate getProposingAssociate() {
        return proposingAssociate;
    }

    public void setProposingAssociate(Associate proposingAssociate) {
        this.proposingAssociate = proposingAssociate;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Agenda agenda = (Agenda) o;
        return Objects.equals(this.id, agenda.id) &&
                Objects.equals(this.description, agenda.description) &&
                Objects.equals(this.proposingAssociate, agenda.proposingAssociate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, proposingAssociate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agenda {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    descrption: ").append(toIndentedString(description)).append("\n");
        sb.append("    proposingAssociate: ").append(toIndentedString(proposingAssociate)).append("\n");
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

