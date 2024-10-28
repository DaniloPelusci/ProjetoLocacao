package br.com.portfoliopelusci.model;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "roteiroAprovadores")
public class RoteiroAprovadores implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "idroteiro")
	private Roteiro roteiro;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private User aprovador;
	
	public RoteiroAprovadores() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Roteiro getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(Roteiro roteiro) {
		this.roteiro = roteiro;
	}

	public User getAprovador() {
		return aprovador;
	}

	public void setAprovador(User aprovador) {
		this.aprovador = aprovador;
	}

	public RoteiroAprovadores(Long id, Roteiro roteiro, User aprovador) {
		super();
		this.id = id;
		this.roteiro = roteiro;
		this.aprovador = aprovador;
	}
	
	

}