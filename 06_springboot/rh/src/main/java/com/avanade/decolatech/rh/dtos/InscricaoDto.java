package com.avanade.decolatech.rh.dtos;

import java.util.Date;

public class InscricaoDto {
	private String area;
	private String cargo;
	private Date dataInscricao;
	private String candidato;
	private String telefone;
	
	// nessa classe em particular, devemos incluir um construtor com todos os atributos como paramentro (nem todas as classes precisam de construtor)
	public InscricaoDto(String area, String cargo, Date data, String candidato, String telefone) {
		this.setArea(area);
		this.setCargo(cargo);
		this.setDataInscricao(data);
		this.setCandidato(candidato);
		this.setTelefone(telefone);
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Date getDataInscricao() {
		return dataInscricao;
	}
	public void setDataInscricao(Date dataInscricao) {
		this.dataInscricao = dataInscricao;
	}
	public String getCandidato() {
		return candidato;
	}
	public void setCandidato(String candidato) {
		this.candidato = candidato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
