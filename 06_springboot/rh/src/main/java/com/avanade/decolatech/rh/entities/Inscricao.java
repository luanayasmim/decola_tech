package com.avanade.decolatech.rh.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_inscricoes")
public class Inscricao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")	
	private int id;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cargo")
	private Cargo cargo;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cpf")
	private Candidato candidato;
	
	@Column(name = "situacao")
	private int situacao;
	
	@Column(name = "data_inscricao")
	@Temporal(value = TemporalType.TIMESTAMP) // Equivalente ao DATETIME
	private Date dataInscricao;

	@Column(name = "data_efetivacao")
	@Temporal(value = TemporalType.TIMESTAMP)	
	private Date dataEfetivacao;

	public Inscricao(){}

	public Inscricao(int id, Cargo cargo, Candidato candidato, int situacao, Date dataInscricao, Date dataEfetivacao) {
		this.setId(id);
		this.setCargo(cargo);
		this.setCandidato(candidato);
		this.setSituacao(situacao);
		this.setDataInscricao(dataInscricao);
		this.setDataEfetivacao(dataEfetivacao);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public Date getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public Date getDataEfetivacao() {
		return dataEfetivacao;
	}

	public void setDataEfetivacao(Date dataEfetivacao) {
		this.dataEfetivacao = dataEfetivacao;
	}
}
