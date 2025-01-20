package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.DocumentoCpf;
import com.avanade.decolatech.classes.Funcionario;
import com.avanade.decolatech.enumeracoes.Generos;

public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Luana");
		funcionario.setIdade(21);
		funcionario.setGenero(Generos.FEMININO);
		funcionario.setCargo("Estágiaria");
		funcionario.setSalario(2000);
		
		DocumentoCpf cpf = new DocumentoCpf();
		cpf.setNumero("12345678901");
		
		funcionario.setDocumento(cpf);
		
		System.out.println(funcionario.getDados());
	}
}
