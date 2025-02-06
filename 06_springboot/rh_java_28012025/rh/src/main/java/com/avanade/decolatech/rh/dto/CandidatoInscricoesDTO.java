package com.avanade.decolatech.rh.dto;

import java.util.Date;

public class CandidatoInscricoesDTO {

	private String cpf;
	private String candidato;
	private Date dataInscricao;
	private String cargo;
	
	public CandidatoInscricoesDTO(String cpf, String candidato, Date data,String cargo) {
		this.setCpf(cpf);
		this.setCandidato(candidato);
		this.setDataInscricao(data);
		this.setCargo(cargo);
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
