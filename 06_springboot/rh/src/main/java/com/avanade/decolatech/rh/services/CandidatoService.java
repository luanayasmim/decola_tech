package com.avanade.decolatech.rh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.repositories.CandidatoRepository;

@Service
public class CandidatoService {
	
	//Injeção de dependencia
	@Autowired
	private CandidatoRepository candidatoRepository;

	//função para buscar um candidato pelo cpf
	public Candidato buscarCandidato(String cpf){
		var candidato = candidatoRepository.getReferenceById(cpf);

		return new Candidato(candidato.getCpf(), candidato.getNome(), candidato.getTelefone(), candidato.getEmail());
	}

	// função para listar todos os candidatos com base nas definições padrão do spring data JPA
	public List<Candidato> listarCandidatos() {
		return candidatoRepository.findAll();
	}
	
	//função para incluir ou alterar um candidato
	public Candidato incluirCandidato(Candidato candidato) {
		return candidatoRepository.save(candidato);
	}

}
