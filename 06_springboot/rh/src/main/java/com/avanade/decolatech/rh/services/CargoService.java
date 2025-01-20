package com.avanade.decolatech.rh.services;

import com.avanade.decolatech.rh.dtos.CargosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avanade.decolatech.rh.dtos.NovoCargoDto;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.repositories.CargoRepository;

import java.util.List;

@Service
public class CargoService {
	@Autowired
	private CargoRepository cargoRepository;
	
	@Autowired
	private AreaService areaService;

	public Cargo buscarCargo(int id){
		var cargo = cargoRepository.getReferenceById(id);

		var area = areaService.buscarArea(cargo.getArea().getId());

		var novoCargo = new Cargo(
				cargo.getId(),
				area,
				cargo.getDescricao(),
				cargo.getSalario(),
				cargo.getTipoSalario());

		return cargoRepository.save(novoCargo);
	}

	public List<CargosDto> listarCargosDto(){
		return cargoRepository.listarCargosDto();
	}

	// função para incluir um novo cargo
	public Cargo incluirCargo(NovoCargoDto request) {
		var area = areaService.buscarArea(request.getIdArea());
		
		var cargo = new Cargo();
		
		cargo.setDescricao(request.getDescricao());
		cargo.setSalario(request.getSalario());
		cargo.setTipoSalario(request.getTipoSalario());
		cargo.setArea(area);
		
		return cargoRepository.save(cargo);
	}
}