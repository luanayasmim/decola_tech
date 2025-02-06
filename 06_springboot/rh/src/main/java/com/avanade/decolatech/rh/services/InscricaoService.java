package com.avanade.decolatech.rh.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.avanade.decolatech.rh.entities.Inscricao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.dtos.CandidatoInscricoesDto;
import com.avanade.decolatech.rh.dtos.InscricaoDto;
import com.avanade.decolatech.rh.repositories.InscricaoRepository;

@Service
public class InscricaoService {

	@Autowired
	private InscricaoRepository inscricaoRepository;

	@Autowired
	private CargoService cargoService;

	@Autowired
	private CandidatoService candidatoService;
	
	public List<InscricaoDto> listarInscricaoDto(){
		return inscricaoRepository.listarIncricoesDto();
	}
	
	public List<CandidatoInscricoesDto> listarIncricoesPorCandidatoDto(){
		return inscricaoRepository.listarInscricoesPorCandidatoDto();
	}
	
	public List<CandidatoInscricoesDto> listarIncricoesPorCandidatoDtoByCpf(String cpf){
		//fazer a validação aqui
		return inscricaoRepository.listarInscricoesPorCandidatoDtoByCpf(cpf);
	}

	public String efetuarInscricao(Map<String, String> dados) throws ParseException {
		String cpf = dados.get("cpf");
		int id_cargo = Integer.parseInt(dados.get("idCargo"));
		int situacao = Integer.parseInt(dados.get("situacao"));
		String data = dados.get("dataInscricao");

		var cargo = cargoService.buscarCargo(id_cargo);
		var candidato = candidatoService.buscarCandidato(cpf);

		Date dataInscricao = new SimpleDateFormat("yyyy-MM-dd").parse(data);

		var inscricao = new Inscricao();
		inscricao.setCandidato(candidato);
		inscricao.setCargo(cargo);
		inscricao.setDataInscricao(dataInscricao);
		inscricao.setSituacao(situacao);

		inscricaoRepository.save(inscricao);

		return "Inscricao do candidato "+candidato.getNome()+" efetuada com sucesso";
	}
}
