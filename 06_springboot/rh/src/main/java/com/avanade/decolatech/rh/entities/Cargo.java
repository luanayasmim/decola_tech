package com.avanade.decolatech.rh.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
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
@Table(name = "tb_cargos")
public class Cargo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_area")
	private Area area;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "salario")
	private double salario;
	
	@Column(name = "tp_salario")
	private int tipoSalario;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cargo") //objeto correspondente a chave estrangeira
	private List<Inscricao> inscricoes;

	public Cargo(){}

	public Cargo(int id, Area area, String descricao, double salario, int tipoSalario){
		this.setId(id);
		this.setArea(area);
		this.setDescricao(descricao);
		this.setSalario(salario);
		this.setTipoSalario(tipoSalario);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipoSalario() {
		return tipoSalario;
	}

	public void setTipoSalario(int tipoSalario) {
		this.tipoSalario = tipoSalario;
	}

	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(List<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
}
