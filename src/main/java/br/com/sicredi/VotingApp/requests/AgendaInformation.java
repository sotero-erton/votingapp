package br.com.sicredi.VotingApp.requests;

import java.util.Objects;

public class AgendaInformation {

    String cpf;
    String description;

    public AgendaInformation(String cpf,
                             String description) {
        this.cpf = cpf;
        this.description = description;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

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
        AgendaInformation that = (AgendaInformation) o;
        return cpf.equals(that.cpf) && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf,
                            description);
    }
}
