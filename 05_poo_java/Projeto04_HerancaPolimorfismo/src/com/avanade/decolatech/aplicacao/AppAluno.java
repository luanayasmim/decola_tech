package com.avanade.decolatech.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.avanade.decolatech.classes.Aluno;
import com.avanade.decolatech.classes.Curso;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppAluno {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		var curso1 = new Curso();
		curso1.setCodigo(1);
		curso1.setDescricao("Java");
		curso1.setCh(40);
		curso1.setPreco(0);
		
		var curso2 = new Curso();
		curso2.setCodigo(1);
		curso2.setDescricao("EcmaScript");
		curso2.setCh(40);
		curso2.setPreco(0);
		
		var curso3 = new Curso();
		curso3.setCodigo(1);
		curso3.setDescricao("Csharp");
		curso3.setCh(40);
		curso3.setPreco(0);
		
		cursos.add(curso1);
		cursos.add(curso2);
		
		//criando uma instancia da classe aluno
		var aluno = new Aluno();
		aluno.setMatricula(1);
		aluno.setNome("Luana");
		aluno.setIdade(21);
		aluno.setGenero(Generos.FEMININO);
		
		aluno.setCurso(curso3);
		aluno.setCursos(cursos);
		
		System.out.println(aluno.getDados());
	}
}
