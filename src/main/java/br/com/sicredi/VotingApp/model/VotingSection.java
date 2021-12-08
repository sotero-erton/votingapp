package br.com.sicredi.VotingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

/**
 * Votos.
 */
@Entity
@Table(name = "VotingSections")
@ApiModel(description = "Votos.")
public class VotingSection {

    @Id
    @JsonProperty("id")
    private String id;

    @NotNull(message = "Não existe Seção de Votação sem Pauta associada...")
    @ManyToOne
    @JoinColumn
    @JsonProperty("Agenda")
    private Agenda agenda;

    @NotNull(message = "Não existe Seção de Votação que não seja criada por algum Associado...")
    @ManyToOne
    @JoinColumn
    @JsonProperty("Associate")
    private Associate associate;

    @NotBlank(message = "Nome da seção de votação não pode estar preenchido por espaços em branco...")
    @NotEmpty(message = "Nome da seção de votação não pode estar vazio...")
    @Length(message = "Número de caracteres para o nome de uma seção de votação é inadequado...", min = 30, max = 40)
    @NotNull(message = "Nome da Seção de Votação não pode ser nulo...")
    @Column(name = "name", unique = true, length = 40)
    @JsonProperty("name")
    private String name;

    @NotNull(message = "Data de Inicio da Seção de Votação não pode ser nulo...")
    @Column(name = "openingDate")
    @JsonProperty("openingDate")
    private Date openingDate;

    @NotNull(message = "Hora de Abertura da Seção de Votação não pode ser nulo...")
    @Column(name = "openingTime")
    @JsonProperty("openingTime")
    private Time openingTime;

    @Min(message = "O tempo mínimo de duração da Seção de Votação é 1 minuto...", value = 1)
    @NotNull(message = "Tempo de Duração da Seção de Votação não pode ser nulo...")
    @Column(name = "duration")
    @JsonProperty("duration")
    private Integer duration;

    public VotingSection id(String id) {
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

    public VotingSection agenda(Agenda agenda) {
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

    public VotingSection associate(Associate associate) {
        this.associate = associate;
        return this;
    }

    /**
     * Get associate
     *
     * @return associate
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Associate getAssociate() {
        return associate;
    }

    public void setAssociate(Associate associate) {
        this.associate = associate;
    }

    public VotingSection name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VotingSection openingDate(@NotNull Date openingDate) {
        this.openingDate = openingDate;
        return this;
    }

    /**
     * Get openingDate
     *
     * @return openingDate
     */
    @ApiModelProperty(required = true, value = "")


    public @NotNull Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(@NotNull Date openingDate) {
        this.openingDate = openingDate;
    }

    public VotingSection openingTime(@NotNull Time openingTime) {
        this.openingTime = openingTime;
        return this;
    }

    /**
     * Get openingTime
     *
     * @return openingTime
     */
    @ApiModelProperty(required = true, value = "")


    public @NotNull Time getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(@NotNull Time openingTime) {
        this.openingTime = openingTime;
    }

    public VotingSection duration(@NotNull Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Get duration
     *
     * @return duration
     */
    @ApiModelProperty(required = true, value = "")


    public @NotNull Integer getDuration() {
        return duration;
    }

    public void setDuration(@NotNull Integer duration) {
        this.duration = duration;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VotingSection votingSection = (VotingSection) o;
        return Objects.equals(this.id, votingSection.id) &&
                Objects.equals(this.agenda, votingSection.agenda) &&
                Objects.equals(this.associate, votingSection.associate) &&
                Objects.equals(this.name, votingSection.name) &&
                Objects.equals(this.openingDate, votingSection.openingDate) &&
                Objects.equals(this.openingTime, votingSection.openingTime) &&
                Objects.equals(this.duration, votingSection.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agenda, associate, name, openingDate, openingTime, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VotingSection {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    agenda: ").append(toIndentedString(agenda)).append("\n");
        sb.append("    associate: ").append(toIndentedString(associate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    openingDate: ").append(toIndentedString(openingDate)).append("\n");
        sb.append("    openingTime: ").append(toIndentedString(openingTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

