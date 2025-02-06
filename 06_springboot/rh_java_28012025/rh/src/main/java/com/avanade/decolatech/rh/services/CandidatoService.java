package com.avanade.decolatech.rh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.repositories.CandidatoRepository;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoRepository candidatoRepository;
	
	// método para listar todos os candidatos com base nas definições padrão do Spring Data JPA
	public List<Candidato> listarCandidatos() {
		return candidatoRepository.findAll();		
	}
	
	// método para incluir ou alterar um candidato
	public Candidato incluirCandidato(Candidato candidato) {

		return candidatoRepository.save(candidato);
	}
	
	// método para buscar um candidato pelo CPF
	public Candidato buscarCandidato(String cpf) {
		Candidato candidato = candidatoRepository.getReferenceById(cpf);
		return new Candidato(
				candidato.getCpf(), 
				candidato.getNome(), 
				candidato.getTelefone(), 
				candidato.getEmail());		
	}
	
	public Candidato alterarCandidato(Candidato candidato, String cpf) {
		candidato.setCpf(cpf);
		return candidatoRepository.save(candidato);		
	}
	
	public String removerCandidato(String cpf) {
		try {
			candidatoRepository.deleteById(cpf);
			return "Candidato removido!";
		} catch (Exception e) {
			return e.toString();
			
		}
	}
}
