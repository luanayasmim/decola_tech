package com.avanade.decolatech.aplicacao;

import com.avanade.decolatech.classes.Endereco;
import com.avanade.decolatech.classes.Pessoa;
import com.avanade.decolatech.enumeracoes.Generos;


public class AppPessoa {
	public static void main(String[] args) {
		var endereco = new Endereco("Praça da Sé", 1, "São Paulo", "01001-000");
		
//		endereco.setCep("01001-000");
//		endereco.setCidade("São Paulo");
//		endereco.setLogradouro("Praça da Sé");
//		endereco.setNumero(1);
		
		var pessoa = new Pessoa();
//		pessoa.setNome("Luana");
//		pessoa.setIdade(21);
//		pessoa.setGenero(Generos.FEMININO);
		pessoa.setEndereco(endereco);
		
		System.out.println(pessoa.getDados());
		//JOptionPane.showMessageDialog(null, pessoa.getDados());
	}
}
