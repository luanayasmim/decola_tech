package com.avanade.decolatech.rh.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.avanade.decolatech.rh.dtos.CandidatoInscricoesDto;
import com.avanade.decolatech.rh.dtos.InscricaoDto;
import com.avanade.decolatech.rh.entities.Inscricao;

public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {

	@Query(value = """
			SELECT
			A.DESCRICAO AS [AREA],
			C.DESCRICAO AS [CARGO],
			I.DATA_INSCRICAO AS [INSCRICAO],
			CD.NOME AS [CANDIDATO],
			CD.TELEFONE AS [TELEFONE]
			FROM TB_CARGOS C
			INNER JOIN TB_INSCRICOES I ON C.ID = I.ID_CARGO
			INNER JOIN TB_CANDIDATOS CD ON I.CPF = CD.CPF
			INNER JOIN TB_AREAS A ON C.ID_AREA = A.ID
			""", nativeQuery = true)
	List<InscricaoDto> listarIncricoesDto();

	@Query(value="select new com.avanade.decolatech.rh.dtos.CandidatoInscricoesDto(cd.cpf, cd.nome, ic.dataInscricao) "
			+ "from Candidato cd inner join cd.inscricoes ic on cd.cpf = ic.candidato.cpf", nativeQuery = false)
	List<CandidatoInscricoesDto> listarInscricoesPorCandidatoDto();

	@Query(value="select new com.avanade.decolatech.rh.dtos.CandidatoInscricoesDto(cd.cpf, cd.nome, ic.dataInscricao) "
			+ "from Candidato cd inner join cd.inscricoes ic on cd.cpf = ic.candidato.cpf where cd.cpf = :cpf")
	List<CandidatoInscricoesDto> listarInscricoesPorCandidatoDtoByCpf(@Param("cpf") String cpf); //forma nomeada
}
