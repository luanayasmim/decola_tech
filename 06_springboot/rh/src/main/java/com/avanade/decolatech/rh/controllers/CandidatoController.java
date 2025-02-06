package com.avanade.decolatech.rh.controllers;

import java.util.Date;
import java.util.List;

import com.avanade.decolatech.rh.common.Resposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.services.CandidatoService;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {

	@Autowired
	private CandidatoService candidatoService;
	
	//Idempotente
	@GetMapping("/lista")
	public ResponseEntity<List<Candidato>> listarCandidatos() {
		return new ResponseEntity<List<Candidato>>(candidatoService.listarCandidatos(), HttpStatus.OK);	
	}

	@GetMapping("/buscar/{cpf}")
	public ResponseEntity<Candidato> buscar(@PathVariable("cpf") String cpf){
		return new ResponseEntity<Candidato>(candidatoService.buscarCandidato(cpf), HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<?> incluir(@RequestBody Candidato candidato) {
		try {
			return new ResponseEntity<Candidato>(candidatoService.incluirCandidato(candidato), HttpStatus.CREATED);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}
	}

	@PutMapping("/alterar/{cpf}")
	public ResponseEntity<Candidato> alterar(
			@RequestBody Candidato candidato,
			@PathVariable("cpf") String cpf){
		return new ResponseEntity<Candidato>(candidatoService.alterarCandidato(candidato, cpf), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/apagar/{cpf}")
	public ResponseEntity<Resposta> apagar(@PathVariable String cpf){
		try {
			String msg = candidatoService.removerCandidato(cpf);
			Resposta resposta = new Resposta(202, new Date(), msg);
			return new ResponseEntity<Resposta>(resposta, HttpStatus.ACCEPTED);
		} catch (Exception e) {
			Resposta resposta = new Resposta(400, new Date(), e.getMessage());
			return new ResponseEntity<Resposta>(resposta, HttpStatus.BAD_REQUEST);
		}
	}
}
