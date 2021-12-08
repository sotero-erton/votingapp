package br.com.sicredi.VotingApp.repositorys;

import br.com.sicredi.VotingApp.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendaRepository extends JpaRepository<Agenda, String> {
}