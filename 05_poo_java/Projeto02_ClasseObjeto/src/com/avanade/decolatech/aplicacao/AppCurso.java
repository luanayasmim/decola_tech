package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Curso;

public class AppCurso {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.codigo = 100;
		curso1.descricao = "Inteligencia Artificial";
		curso1.ch = 120;
		curso1.preco = 4000;
		
		var curso2 = new Curso();
		curso1.codigo = 200;
		curso1.descricao = "Culinaria Básica";
		curso1.ch = 8;
		curso1.preco = 0;
		
		var curso3 = curso1;
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(curso3);
	}
}
