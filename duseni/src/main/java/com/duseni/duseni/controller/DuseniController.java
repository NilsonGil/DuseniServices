package com.duseni.duseni.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DuseniController {
	
	@GetMapping(value = "/Hola")
	public String getHola() {
//		return JsonManager.toJson(categoryRepository.findAll());
		return "Hola, estamos aprendiendo spring ";
	}


}
