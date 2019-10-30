package com.duseni.duseni.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.duseni.duseni.entities.Product;
import com.duseni.duseni.persistence.JsonManager;
import com.duseni.duseni.repository.ProductRepository;




@RestController
public class DuseniController {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	
	@GetMapping(value = "/Hola")
	public String getHola() {
//		return JsonManager.toJson(categoryRepository.findAll());
		return "Hola, estamos aprendiendo spring ";
	}
	
	
	// crear producto
	
	//--------------------------- crud productos -----------------------//
	
	
	/*
	 * crea un producto 
	 */
	
	@PostMapping (value = "/addProduct")
	public String addProduct(@Valid @RequestBody Product product) {
		return JsonManager.toJson(productRepository.save(product));
	}
	
	/*
	 * busca un producto
	 */
	@GetMapping(value = "/product/{id}")
	public String getProduct(@PathVariable Long id) {
		return JsonManager.toJson(productRepository.findById(id));
	}
	
	
	/*
	 * elimina un producto por id
	 */
	@DeleteMapping(value = "/removeProduct/{id}")
	public void removeProduct( @PathVariable Long id) {
		productRepository.deleteById(id);
	}
	
	
	/*
	 * Edita un producto
	 */

	@PutMapping(value = "/editProduct")
	public String editProduct(@Valid @RequestBody Product product) {
		return JsonManager.toJson(productRepository.save(product));
	}
}
