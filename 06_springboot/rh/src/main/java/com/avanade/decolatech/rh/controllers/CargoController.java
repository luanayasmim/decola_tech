package com.avanade.decolatech.rh.controllers;

import com.avanade.decolatech.rh.dtos.CargosDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.avanade.decolatech.rh.dtos.NovoCargoDto;
import com.avanade.decolatech.rh.entities.Cargo;
import com.avanade.decolatech.rh.services.CargoService;

import java.util.List;

@RestController
@RequestMapping("/cargos")
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@GetMapping("/lista")
	public ResponseEntity<List<CargosDto>> listar(){
		return new ResponseEntity<List<CargosDto>>(cargoService.listarCargosDto(), HttpStatus.OK);
	}
	
	@PostMapping("/novo")
	public ResponseEntity<Cargo> incluir(@RequestBody NovoCargoDto request){
		try {
			return new ResponseEntity<Cargo>(cargoService.incluirCargo(request), HttpStatus.CREATED);
		}catch(Exception e) {
			throw new RuntimeException(e);		
		}
	}
}
