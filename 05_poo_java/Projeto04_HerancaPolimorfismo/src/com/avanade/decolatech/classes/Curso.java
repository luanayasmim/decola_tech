package com.avanade.decolatech.classes;

public class Curso {
	private String descricao;
	private int ch;
	private double preco;
	private int codigo;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCh() {
		return ch;
	}
	
	public void setCh(int ch) {
		if(ch<=0) throw new NumberFormatException("A carga horária deve ser maior que zero");
		this.ch = ch;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco<0) throw new NumberFormatException("O preço não pode ser negativo");
		this.preco = preco;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDados(int codigo, String descricao, int cargaHoraria, double preco) {
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setPreco(preco);
		this.setCh(cargaHoraria);
	}
	
	public String getDados() {
		String response = "Código: " + this.getCodigo() + 
				"\nDescrição: " + this.getDescricao() +
				"\nPreço: " + this.getPreco() +
				"\nCarga Horária: " + this.getCh();
		return response;
	}
	
}
