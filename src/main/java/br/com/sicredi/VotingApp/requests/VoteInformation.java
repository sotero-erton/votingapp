package br.com.sicredi.VotingApp.requests;

import java.util.Objects;

public class VoteInformation {

    String idAgenda;
    String cpf;
    String digitalSignature;
    Boolean approvedAgenda;

    public VoteInformation(String idAgenda, String cpf, String digitalSignature, Boolean approvedAgenda) {
        this.idAgenda = idAgenda;
        this.cpf = cpf;
        this.digitalSignature = digitalSignature;
        this.approvedAgenda = approvedAgenda;
    }

    public String getIdAgenda() {
        return idAgenda;
    }

    public void setIdAgenda(String idAgenda) {
        this.idAgenda = idAgenda;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDigitalSignature() {
        return digitalSignature;
    }

    public void setDigitalSignature(String digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    public Boolean getApprovedAgenda() {
        return approvedAgenda;
    }

    public void setApprovedAgenda(Boolean approvedAgenda) {
        this.approvedAgenda = approvedAgenda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VoteInformation that = (VoteInformation) o;
        return idAgenda.equals(that.idAgenda) && cpf.equals(that.cpf) &&
                digitalSignature.equals(that.digitalSignature) &&
                approvedAgenda.equals(that.approvedAgenda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAgenda, cpf, digitalSignature, approvedAgenda);
    }
}
