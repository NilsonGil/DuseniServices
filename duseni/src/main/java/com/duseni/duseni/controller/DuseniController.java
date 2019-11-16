package com.duseni.duseni.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.duseni.duseni.entities.City;
import com.duseni.duseni.entities.Member;
import com.duseni.duseni.entities.Product;
import com.duseni.duseni.persistence.JsonManager;
import com.duseni.duseni.repository.CityRepository;
import com.duseni.duseni.repository.MemberRepository;
import com.duseni.duseni.repository.OrderRepository;
import com.duseni.duseni.repository.ProductRepository;




@RestController
public class DuseniController {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Autowired
	private  CityRepository cityRepository;
	
	@Autowired
	private  MemberRepository	memberRepository;
	
	@Autowired
	private  OrderRepository	orderRepository;
	
	
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
	
	/*
	 * Obtener todos los productos de la base de datos
	 */
	@GetMapping(value = "/allProducts")
	public String getallProducts() {
		return JsonManager.toJson(productRepository.findAll());
	}
	
	//--------------------------------------------------------------------------------//
	
	
	
	
	
	//----------------------------- crud ciudades ------------------------------------//
	
	@PostMapping (value = "/addCity")
	public String addCity(@Valid @RequestBody City city) {
		return JsonManager.toJson(cityRepository.save(city));
	}
	
	/*
	 * busca un ciudad
	 */
	@GetMapping(value = "/city/{id}")
	public String getCity(@PathVariable Long id) {
		return JsonManager.toJson(cityRepository.findById(id));
	}
	
	
	/*
	 * elimina un ciudad por id
	 */
	@DeleteMapping(value = "/removeCity/{id}")
	public void removeCity( @PathVariable Long id) {
		cityRepository.deleteById(id);
	}
	
	
	/*
	 * Edita  ciudad
	 */

	@PutMapping(value = "/editCity")
	public String editCity(@Valid @RequestBody City city) {
		return JsonManager.toJson(cityRepository.save(city));
	}
	
	
	
	
	
	//--------------------------------------------------------------------------------//

	
	
	
	
	//----------------------------- crud miembros ------------------------------------//
	
	
	@PostMapping (value = "/addMember")
	public String addMember(@Valid @RequestBody Member member) {
		return JsonManager.toJson(memberRepository.save(member));
	}
	
	
	
	@GetMapping(value = "/member/{id}")
	public String getMember(@PathVariable Long id) {
		System.out.println("Consulta ---------------------" + memberRepository.findById(id));
		Optional<Member> m =  memberRepository.findById(id);
		System.out.println("Consulta ---------------------" + m.get());
		System.out.println(JsonManager.simpleJsonWithCustomSerialization(m.get()));
//		return JsonManager.toJson(memberRepository.findById(id));
		return "Hola";
	}
	
	
	/*
	 * elimina un ciudad por id
	 */
	@DeleteMapping(value = "/removeMember/{id}")
	public void removeMember( @PathVariable Long id) {
		memberRepository.deleteById(id);
	}
	
	
	/*
	 * Obtener todos los miembros
	 */
	@GetMapping(value = "/allMembers")
	public String getAllMembers() {
		return JsonManager.toJson(memberRepository.findAll());
	}
	
	/*
	 * Edita  ciudad
	 */

	@PutMapping(value = "/editMember")
	public String editMember(@Valid @RequestBody Member member) {
		return JsonManager.toJson(memberRepository.save(member));
	}
	
	
	
	
	//--------------------------------------------------------------------------------//
	
	
	
	
	
	
}
