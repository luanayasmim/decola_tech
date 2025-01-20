package com.avanade.decolatech.rh.repositories;

import com.avanade.decolatech.rh.dtos.CargosDto;
import org.springframework.data.jpa.repository.JpaRepository;

import com.avanade.decolatech.rh.entities.Cargo;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {
    @Query(value = """
            SELECT\s
                C.ID AS ID,
                A.DESCRICAO AS AREA,
                C.DESCRICAO AS CARGO,
                C.SALARIO AS SALARIO,
                CASE C.TP_SALARIO
                    WHEN 1 THEN 'Mensal'
                    WHEN 2 THEN 'Por hora'
                END AS TIPO
            FROM TB_AREAS A INNER JOIN TB_CARGOS C ON A.ID = C.ID_AREA
            """, nativeQuery = true)
    List<CargosDto> listarCargosDto();
}
