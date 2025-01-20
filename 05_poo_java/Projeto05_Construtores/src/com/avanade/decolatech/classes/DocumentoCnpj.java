package com.avanade.decolatech.classes;

import com.avanade.decolatech.interfaces.Documento;

public class DocumentoCnpj implements Documento {
	private String numero;
	
	@Override
	public void setNumero(String numero) {
		if(!numero.matches("[0-9]{14}"))
			throw new IllegalArgumentException("O cnpj deve conter 14 digitos");
		
		this.numero = numero;
	}

	@Override
	public String getNumero() {
		return "Cnpj:" + this.numero;
	}
}
