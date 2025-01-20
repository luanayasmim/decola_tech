package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setCodigo(100);
		curso1.setDescricao("Inteligencia Artificial");
		curso1.setCh(120);
		curso1.setPreco(4000);
		
		var curso2 = new Curso();
		curso1.setCodigo(200);
		curso1.setDescricao("Culinária Básica");
		curso1.setCh(8);
		curso1.setPreco(0);
		
		curso2 = null;
		
		var curso3 = curso1;
		
		System.gc(); // solicita prioridade na limpeza da memória heap
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
	}
}
