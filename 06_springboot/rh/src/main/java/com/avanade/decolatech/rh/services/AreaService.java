package com.avanade.decolatech.rh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.entities.Area;
import com.avanade.decolatech.rh.repositories.AreaRepository;

@Service
public class AreaService {
	
	@Autowired
	private AreaRepository areaRepository;
	

	// função para buscar instancia de area através da chave primária
	public Area buscarArea(int id) {
		Area area = areaRepository.getReferenceById(id);
		
		return new Area(area.getId(), area.getDescricao());
	}
}
