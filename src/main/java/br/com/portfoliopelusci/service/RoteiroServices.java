package br.com.portfoliopelusci.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.portfoliopelusci.model.Roteiro;
import br.com.portfoliopelusci.repository.RoteiroRepository;

@Service
public class RoteiroServices {
	@Autowired
	RoteiroRepository repository;
	
	public List<Roteiro> findAll() {
		return repository.findAll();
	}

	public Roteiro create(Roteiro roteiro) {
		return repository.save(roteiro);
	}

	public Optional<Roteiro> findById(Long id) {
		return repository.findById(id);
	}
}
