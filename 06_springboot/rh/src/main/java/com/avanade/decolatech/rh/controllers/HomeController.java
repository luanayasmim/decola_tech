package com.avanade.decolatech.rh.controllers;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String inicio() {
		return "Sistema de gestão de rh";
	}
	
	@GetMapping("/nomes")
	public List<String> mostrarNomes(){
		List<String> nomes = new ArrayList<String>();
		nomes.add("Luana");
		nomes.add("Yasmim");
		
		return nomes;
	}
	
}
