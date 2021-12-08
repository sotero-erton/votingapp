package br.com.sicredi.VotingApp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * Associado da Cooperativa.
 */
@Entity
@Table(name = "associates")
@ApiModel(description = "Associado da Cooperativa.")
public class Associate {

    @Id
    @JsonProperty("id")
    private String id;

    @Length(message = "Número de caracteres incorreto para um CPF...", min = 14, max = 14)
    @NotBlank(message = "O campo CPF não pode ser preenchido por espaços em branco...")
    @NotEmpty(message = "Campo CPF não pode estar vazio...")
    @Pattern(regexp = "\\d{3}.\\d{3}.\\d{3}-\\d{2}")
    @NotNull(message = "Campo CPF não pode ser nulo...")
    @ApiModelProperty(
            notes = "CPF do Associado.",
            name = "cpf", required = true)
    @Column(name = "cpf", nullable = false, unique = true)
    @JsonProperty("cpf")
    private String cpf;

    @NotBlank(message = "O campo nome não pode ser preenchido por espaços em branco...")
    @NotEmpty(message = "O campo nome não pode estar vazio...")
    @Length(message = "Número de caracteres inadequado para um nome...", min = 5, max = 60)
    @NotNull(message = "Campo nome não pode ser nulo...")
    @ApiModelProperty(
            notes = "Nome do Associado.",
            name = "name", required = true)
    @Column(name = "name", nullable = false, unique = true, length = 60)
    @JsonProperty("name")
    private String name;

    @NotBlank(message = "O campo Assinatura Digital não pode estar preenchido com espaços em branco...")
    @NotEmpty(message = "O campo Assinatura Digital não pode estar vazio...")
    @Length(message = "Número de caracteres incorreto para um objeto do tipo UUID...", min = 128, max = 128)
    @NotNull(message = "O Assinatura Digital não pode ser nulo...")
    @ApiModelProperty(
            notes = "Assinatura Digital para autenticação de Votação.",
            name = "digitalSignatureVoting", required = true)
    @Column(name = "digitalSignatureVoting", nullable = false, length = 128)
    @JsonProperty("digitalSignatureVoting")
    private String digitalSignatureVoting;

    @NotBlank(
            message = "O campo Assinatura Digital para Abertura de Seção não pode ser preenchido por espaços vazios...")
    @ApiModelProperty(
            notes = "Assinatura Digital de autorização para abertura de Seção de Votação.",
            name = "digitalSignatureSectionOpening", required = false)
    @Column(name = "digitalSignatureSectionOpening", nullable = false, length = 128)
    @JsonProperty("digitalSignatureSectionOpening")
    private String digitalSignatureSectionOpening;

    @NotBlank(message = "O campo Senha não pode estar preenchido por espaços em branco...")
    @NotEmpty(message = "O campo Senha não pode estar vazio...")
    @Length(message = "O campo senha deve ter 8 caracteres...", min = 8, max = 8)
    @NotNull(message = "O campo Senha não pode ser nulo...")
    @ApiModelProperty(
            notes = "Senha.",
            name = "password", required = false)
    @Column(name = "password", nullable = false, length = 8)
    @JsonProperty("password")
    private String password;

    public Associate id(String id) {
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

    public Associate cpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    /**
     * CPF do Associado.
     *
     * @return cpf
     */
    @ApiModelProperty(required = true, value = "CPF do Associado.")
    @NotNull


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Associate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Nome completo.
     *
     * @return name
     */
    @ApiModelProperty(required = true, value = "Nome completo.")
    @NotNull


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Associate digitalSignatureVoting(String digitalSignatureVoting) {
        this.digitalSignatureVoting = digitalSignatureVoting;
        return this;
    }

    /**
     * Assiatura Digital para validação de votação.
     *
     * @return digitalSignatureVoting
     */
    @ApiModelProperty(required = true, value = "Assiatura Digital para validação de votação.")
    @NotNull


    public String getDigitalSignatureVoting() {
        return digitalSignatureVoting;
    }

    public void setDigitalSignatureVoting(String digitalSignatureVoting) {
        this.digitalSignatureVoting = digitalSignatureVoting;
    }

    public Associate digitalSignatureSectionOpening(String digitalSignatureSectionOpening) {
        this.digitalSignatureSectionOpening = digitalSignatureSectionOpening;
        return this;
    }

    /**
     * Assinatura Digital de autorização de abertura de Seção de Votação.
     *
     * @return digitalSignatureSectionOpening
     */
    @ApiModelProperty(value = "Assinatura Digital de autorização de abertura de Seção de Votação.")


    public String getDigitalSignatureSectionOpening() {
        return digitalSignatureSectionOpening;
    }

    public void setDigitalSignatureSectionOpening(String digitalSignatureSectionOpening) {
        this.digitalSignatureSectionOpening = digitalSignatureSectionOpening;
    }

    public Associate password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Senha de acesso.
     *
     * @return password
     */
    @ApiModelProperty(required = true, value = "Senha de acesso.")
    @NotNull


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Associate associate = (Associate) o;
        return Objects.equals(this.id, associate.id) &&
                Objects.equals(this.cpf, associate.cpf) &&
                Objects.equals(this.name, associate.name) &&
                Objects.equals(this.digitalSignatureVoting, associate.digitalSignatureVoting) &&
                Objects.equals(this.digitalSignatureSectionOpening, associate.digitalSignatureSectionOpening) &&
                Objects.equals(this.password, associate.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cpf, name, digitalSignatureVoting, digitalSignatureSectionOpening, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Associate {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    digitalSignatureVoting: ").append(toIndentedString(digitalSignatureVoting)).append("\n");
        sb.append("    digitalSignatureSectionOpening: ").append(toIndentedString(digitalSignatureSectionOpening))
                .append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

