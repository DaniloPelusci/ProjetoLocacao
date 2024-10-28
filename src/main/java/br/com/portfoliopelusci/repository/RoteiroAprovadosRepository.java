package br.com.portfoliopelusci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portfoliopelusci.model.RoteiroAprovadores;

@Repository
public interface RoteiroAprovadosRepository extends JpaRepository<RoteiroAprovadores, Long> {

}
