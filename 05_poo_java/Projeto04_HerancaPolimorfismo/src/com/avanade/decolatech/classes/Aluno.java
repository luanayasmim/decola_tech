package com.avanade.decolatech.classes;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
	private int matricula;
	private List<Curso> cursos;
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public List<Curso> getCursos() {
		return cursos;
	}
	
	public void setCursos(List<Curso> cursos) {
		if(this.getCursos() == null) 
			this.cursos = new ArrayList<Curso>();
		
		this.cursos.addAll(cursos);
	}
	
	//método para adicionar um curso
	public void setCurso(Curso curso) {
		if(this.getCursos() == null) 
			this.cursos = new ArrayList<Curso>();			

		this.cursos.add(curso);
	}
	
	@Override
	public String getDados() {
		var sb = new StringBuilder();
		sb.append(super.getDados())
		.append("\n\n")
		.append("Matricula: ").append(this.getMatricula());
		
		if(this.getCursos() != null && this.getCursos().size() > 0) 
			sb.append(this.listarCursos());
		else
			sb.append("\n Este aluno não está matriculado em nenhum curso");
		
		return sb.toString();
	}
	
	//método que retorna a lista de cursos se existirem
	private String listarCursos() {
		var i = 1;
		var sb = new StringBuilder();
		
		for(Curso curso : this.getCursos()) {
			sb.append("\nCurso: ").append(i).append(": \n").append(curso.getDados()).append("\n\n");
			i++;
		}
		
		return sb.toString();
			
	}
}
