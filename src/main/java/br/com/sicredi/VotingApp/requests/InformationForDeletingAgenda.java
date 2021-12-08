package br.com.sicredi.VotingApp.requests;

import java.util.Objects;

public class InformationForDeletingAgenda {

    String cpf;
    String agendaIdentifier;

    public InformationForDeletingAgenda(String cpf, String agendaIdentifier) {
        this.cpf = cpf;
        this.agendaIdentifier = agendaIdentifier;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgendaIdentifier() {
        return agendaIdentifier;
    }

    public void setAgendaIdentifier(String agendaIdentifier) {
        this.agendaIdentifier = agendaIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InformationForDeletingAgenda that = (InformationForDeletingAgenda) o;
        return cpf.equals(that.cpf) && agendaIdentifier.equals(that.agendaIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, agendaIdentifier);
    }
}
