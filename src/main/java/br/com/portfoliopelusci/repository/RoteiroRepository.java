package br.com.portfoliopelusci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portfoliopelusci.model.Roteiro;

@Repository
public interface RoteiroRepository extends JpaRepository<Roteiro, Long> {

}
