package com.avanade.decolatech.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.avanade.decolatech.classes.Aluno;
import com.avanade.decolatech.classes.Curso;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppAluno {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Java", 40));
		cursos.add(new Curso("EcmaScript", 90, 10));
		
		//criando uma instancia da classe aluno
		var aluno = new Aluno();
		aluno.setMatricula(1);
		aluno.setNome("Luana");
		aluno.setIdade(21);
		aluno.setGenero(Generos.FEMININO);
		aluno.setCurso(new Curso("Csharp", 40));
		aluno.setCursos(cursos);
		
		System.out.println(aluno.getDados());
	}
}
