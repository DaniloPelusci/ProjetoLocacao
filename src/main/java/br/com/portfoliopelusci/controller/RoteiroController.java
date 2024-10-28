package br.com.portfoliopelusci.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfoliopelusci.model.Roteiro;
import br.com.portfoliopelusci.service.RoteiroServices;

@RestController
@RequestMapping("/api/roteiro/v1")
public class RoteiroController {
	
	@Autowired
	private RoteiroServices service;
	
	@GetMapping(path = "/{id}")
	public Roteiro findAll(@PathVariable(value = "id") Long id) {
		return service.findById(id).get();
	}
	
	@PostMapping(path = "/enviarRoteiro")
	public Roteiro create(@RequestBody Roteiro roteiro) {
		return service.create(roteiro);
	}

}
