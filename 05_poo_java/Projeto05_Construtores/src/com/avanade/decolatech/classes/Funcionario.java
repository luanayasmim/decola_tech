package com.avanade.decolatech.classes;

import com.avanade.decolatech.interfaces.Documento;

public class Funcionario extends Pessoa{
	private String cargo;
	private double salario;
	private Documento documento;
	
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String getDados() {
	StringBuilder sb = new StringBuilder();
		sb.append(super.getDados()).append("\n\n")
			.append("Cargo: ").append(this.getCargo())
			.append("\nSalário: ").append(this.getSalario());
		
		if(this.getDocumento() != null)
			sb.append("\nDocumento: ").append(this.getDocumento().getNumero());
		
		return sb.toString();
	}
}
