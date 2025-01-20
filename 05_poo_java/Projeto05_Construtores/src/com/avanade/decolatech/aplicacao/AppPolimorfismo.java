package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppPolimorfismo {
	public static void main(String[] args) {
		var pessoa = new Pessoa();
		pessoa.setNome("Luana");
		pessoa.setIdade(21);
		pessoa.setGenero(Generos.FEMININO);
		
		var funcionario = new Funcionario();
		funcionario.setNome("Luana");
		funcionario.setIdade(21);
		funcionario.setGenero(Generos.FEMININO);
		funcionario.setCargo("Estágiaria");
		funcionario.setSalario(2000);
		
		var p = pessoa;
		System.out.println(p.getDados());
		
		p = funcionario;
		System.out.println(p.getDados());
	}
}
