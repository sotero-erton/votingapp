package br.com.sicredi.VotingApp.repositorys;

import br.com.sicredi.VotingApp.model.Voting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingRepository extends JpaRepository<Voting, String> {



}