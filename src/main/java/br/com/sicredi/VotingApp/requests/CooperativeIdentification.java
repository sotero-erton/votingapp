package br.com.sicredi.VotingApp.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;

import java.util.Objects;

@ApiModel(description = "Informações de identificação do Associado.")
public class CooperativeIdentification {

    @JsonProperty("cpf")
    private String cpf;

    public CooperativeIdentification(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CooperativeIdentification that = (CooperativeIdentification) o;
        return Objects.equals(cpf, that.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public String toString() {
        return "CooperativeIdentification{" +
                "cpf='" + cpf + '\'' +
                '}';
    }
}
