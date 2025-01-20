package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Inteligência Artificial", 120, 4000);

		var curso2 = new Curso("Culinária Básica", 8);
		
		//curso2 = null;
		
		var curso3 = curso1;
		
		//System.gc(); // solicita prioridade na limpeza da memória heap
		
		System.out.println(curso1.getDados());
		System.out.println(curso2.getDados());
		System.out.println(curso3.getDados());
	}
}
