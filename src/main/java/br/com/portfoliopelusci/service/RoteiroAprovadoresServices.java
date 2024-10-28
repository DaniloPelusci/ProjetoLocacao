package br.com.portfoliopelusci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portfoliopelusci.model.RoteiroAprovadores;
import br.com.portfoliopelusci.repository.RoteiroAprovadosRepository;

@Service
public class RoteiroAprovadoresServices {
	@Autowired
	RoteiroAprovadosRepository repository;
	
	public List<RoteiroAprovadores> findAll() {
		
		return repository.findAll();
	}

	
	
}
