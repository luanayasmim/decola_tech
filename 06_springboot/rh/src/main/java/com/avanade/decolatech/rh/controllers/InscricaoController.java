package com.avanade.decolatech.rh.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.avanade.decolatech.rh.common.Resposta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.avanade.decolatech.rh.dtos.InscricaoDto;
import com.avanade.decolatech.rh.dtos.CandidatoInscricoesDto;
import com.avanade.decolatech.rh.services.InscricaoService;

@RestController
@RequestMapping("/inscricoes")
public class InscricaoController {

	@Autowired
	private InscricaoService inscricaoService;
	
	@GetMapping("/lista")
	public ResponseEntity<List<InscricaoDto>> listar(){
		return new ResponseEntity<List<InscricaoDto>>(inscricaoService.listarInscricaoDto(), HttpStatus.OK);
	}
	
//	@GetMapping("/candidatos")
//	public ResponseEntity<List<CandidatoInscricoesDto>> listarIncricoesPorCandidato(){
//		return new ResponseEntity<List<CandidatoInscricoesDto>>(inscricaoService.listarIncricoesPorCandidatoDto(), HttpStatus.OK);
//	}

//	@GetMapping("/candidatos/{cpf}")
//	public ResponseEntity<List<CandidatoInscricoesDto>> listarIncricoesPorCandidatoByCpf(@PathVariable("cpf") String cpf){
//		return new ResponseEntity<List<CandidatoInscricoesDto>>(inscricaoService.listarIncricoesPorCandidatoDtoByCpf(cpf), HttpStatus.OK);
//	}
	
	@GetMapping({"/candidatos", "/candidatos/{cpf}"})
	public ResponseEntity<List<CandidatoInscricoesDto>> listarIncricoesPorCandidato(@PathVariable(name = "cpf", required = false) String cpf){
		if(cpf == null)
			return new ResponseEntity<List<CandidatoInscricoesDto>>(inscricaoService.listarIncricoesPorCandidatoDto(), HttpStatus.OK);
		
		return new ResponseEntity<List<CandidatoInscricoesDto>>(inscricaoService.listarIncricoesPorCandidatoDtoByCpf(cpf), HttpStatus.OK);
		
	}

	@PostMapping("/novo")
	public ResponseEntity<Resposta> incluir(@RequestBody Map<String, String> dados){
		try{
			var resposta = inscricaoService.efetuarInscricao(dados);
			return new ResponseEntity<Resposta>(new Resposta(201, new Date(), resposta),HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Resposta>(new Resposta(400, new Date(), e.getMessage()), HttpStatus.BAD_REQUEST);
		}
	}
}
