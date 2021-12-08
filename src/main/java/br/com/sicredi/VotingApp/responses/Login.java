package br.com.sicredi.VotingApp.responses;

import java.util.Objects;

public class Login {

    String cpf;
    String senha;

    public Login(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

    public Login(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Login login = (Login) o;
        return cpf.equals(login.cpf) && Objects.equals(senha, login.senha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, senha);
    }
}
