package com.avanade.decolatech.rh.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.dto.CargosDTO;
import com.avanade.decolatech.rh.dto.NovoCargoDTO;
import com.avanade.decolatech.rh.entities.Area;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.repositories.CargoRepository;

@Service
public class CargoService {

	@Autowired
	private CargoRepository cargoRepository;
	
	@Autowired
	private AreaService areaService;
	
	// metodo para incluir um novo cargo
	public Cargo incluirCargo (NovoCargoDTO dto) {
		
		// obtendo a referencia ao objeto Area
		Area area = areaService.buscarArea(dto.getIdArea());
		
		Cargo cargo = new Cargo();
		cargo.setDescricao(dto.getDescricao());
		cargo.setSalario(dto.getSalario());
		cargo.setTipoSalario(dto.getTipoSalario());
		cargo.setArea(area);
		
		return cargoRepository.save(cargo);
		
	}
	
	public List<CargosDTO> listarCargosDTO() {
		return cargoRepository.listarCargosDTO();
	}
	
	public Cargo buscarCargo(int id) {
		Cargo cargo = cargoRepository.getReferenceById(id);
		Area area = areaService.buscarArea(cargo.getArea().getId());
		
		// Novo objeto do tipo Cargo, a ser retornado
		Cargo novo = new Cargo(
			cargo.getId(), area, cargo.getDescricao(), cargo.getSalario(), cargo.getTipoSalario());
				
		return cargoRepository.save(novo);
		
	}
	
}



