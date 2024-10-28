package br.com.portfoliopelusci.model;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "roteiro")
public class Roteiro implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	


	
	@ManyToOne
	@JoinColumn(name = "idAnalista")
	private User analista;
	
	@ManyToOne
	@JoinColumn(name = "IDREVISOR")
	private User revisor;
	
	@Column(name = "texto")
	private String texto;
	@Column(name = "NOMECLIENTE")
	private String nomeCliente;
	
	@Column(name = "EMAILCLIENTE")
	private String emailCliente;
	
	@Column(name = "dataenvio")
	private Date dataEnvio;
	
	@Column(name = "opiniaoanalista")
	private String opiniaoAnalista;
	
	@Column(name = "revisao")
	private String revisao;
	
	@OneToMany(orphanRemoval = false, mappedBy = "roteiro", fetch = FetchType.LAZY)
	private List<RoteiroAprovadores> RoteirosAprovadores;

	

	
	
}