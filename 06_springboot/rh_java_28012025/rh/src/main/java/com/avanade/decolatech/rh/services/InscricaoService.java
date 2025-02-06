package com.avanade.decolatech.rh.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.dto.CandidatoInscricoesDTO;
import com.avanade.decolatech.rh.dto.InscricaoDTO;
import com.avanade.decolatech.rh.entities.Candidato;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.entities.Inscricao;
import com.avanade.decolatech.rh.repositories.InscricaoRepository;

@Service
public class InscricaoService {

	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	@Autowired
	private CargoService cargoService;
	
	@Autowired
	private CandidatoService candidatoService;
	
	
	public List<InscricaoDTO> listarInscricoesDTO() {
		return inscricaoRepository.listarInscricoesDTO();
	}
	
	public List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTO() {
		return inscricaoRepository.listarInscricoesPorCandidatoDTO();
	}

	public List<CandidatoInscricoesDTO> listarInscricoesPorCandidatoDTOByCPF(String cpf) {
		return inscricaoRepository.listarInscricoesPorCandidatoDTOByCPF(cpf);
	}

	public String efetuarInscricao(Map<String, String> dados) throws ParseException {
		// obtendo os dados do JSON por meio do Map:
		String cpf = dados.get("cpf");
		int id_cargo = Integer.parseInt(dados.get("idCargo"));
		int situacao = Integer.parseInt(dados.get("situacao"));
		String data = dados.get("dataInscricao");		
		// obtendo as referencias para Cargo e Candidato
		Cargo cargo = cargoService.buscarCargo(id_cargo);
		Candidato candidato = candidatoService.buscarCandidato(cpf);
		
		// convertendo a data para o objeto Date
		Date dataInscricao = new SimpleDateFormat("yyyy-MM-dd").parse(data);
		
		// Criando uma instância da classe Inscricao
		Inscricao inscricao = new Inscricao();
		inscricao.setCandidato(candidato);
		inscricao.setCargo(cargo);
		inscricao.setDataInscricao(dataInscricao);
		inscricao.setSituacao(situacao);
		
		// persistindo a inscricao com o JPA
		inscricaoRepository.save(inscricao);
		return "Inscrição do candidato " + candidato.getNome() + " efetuada com sucesso!";
	}
}




