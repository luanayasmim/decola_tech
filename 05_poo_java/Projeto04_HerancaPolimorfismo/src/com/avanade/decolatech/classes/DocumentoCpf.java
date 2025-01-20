package com.avanade.decolatech.classes;

import com.avanade.decolatech.interfaces.Documento;

public class DocumentoCpf implements Documento {

	private String numero;
	
	@Override
	public void setNumero(String numero) {
		if(!numero.matches("[0-9]{11}"))
			throw new IllegalArgumentException("O cpf deve conter 11 digitos");
		
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return "Cpf:" + this.numero.toString();
	}

}
