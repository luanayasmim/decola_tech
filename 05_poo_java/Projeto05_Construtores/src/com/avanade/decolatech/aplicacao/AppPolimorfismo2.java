package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppPolimorfismo2 {
	public static void main(String[] args) {
		Pessoa pessoa = new Funcionario();
		pessoa.setNome("Luana");
		pessoa.setIdade(21);
		pessoa.setGenero(Generos.FEMININO);
		//pessoa.setCargo("Estágiaria");
		//pessoa.setSalario(2000);
		
		//typecast
		Funcionario funcionario = (Funcionario) pessoa;
		funcionario.setCargo("Estágiaria");
		funcionario.setSalario(2000);
	}
}
