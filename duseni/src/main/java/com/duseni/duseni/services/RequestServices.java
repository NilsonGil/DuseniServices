package com.duseni.duseni.services;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.duseni.duseni.entities.Request;
import com.duseni.duseni.persistence.JsonManager;
import com.duseni.duseni.repository.RequestRepository;

@CrossOrigin(origins = { "http://localhost:4200","http://localhost:8100" ,"http://localhost:8200" })
@RestController
public class RequestServices {
	@Autowired
	private RequestRepository requestRepository;
	
	// ****** CRUD PEDIDOS *******//
	
	/*
	 * AGREGA UN NUEVO PEDIDO
	 */
	@PostMapping (value = "/addRequest")
	public String addRequest(@Valid @RequestBody Request request) {
		return JsonManager.toJson(requestRepository.save(request));
	}
	
	/*
	 * BUSCAR MIEMBRO POR ID
	 */	
	@GetMapping(value = "/request/{id}")
	public String getRequest(@PathVariable Long id) {
		Optional<Request> requestFound =  requestRepository.findById(id);
		return JsonManager.toJson(requestFound.get());
	}
	
	/*
	 * EDITA UN MIEMBRO
	 */
	@PutMapping(value = "/editRequest")
	public String editRequest(@Valid @RequestBody Request request) {
		return JsonManager.toJson(requestRepository.save(request));
	}
	
	/*
	 * ELIMINA UN MIEMBRO POR ID
	 */
	@DeleteMapping(value = "/removeRequest/{id}")
	public void removeRequest( @PathVariable Long id) {
		requestRepository.deleteById(id);
	}
	

	// ****** CONSULTAS DIFERENTES *******//

	@GetMapping(value = "/allRequests")
	public String getAllRequests() {
		return JsonManager.toJson(requestRepository.findAll());
		//return JsonManager.getPedios(requestRepository.findAll());
	}

	@GetMapping(value = "/allRequestsOfContributionMember/{cedulaMember}")
	public String getAllRequestsOfContributionMember(@PathVariable Long cedulaMember) {
		return JsonManager.toJson(requestRepository.getPedidosContribucionesMember(cedulaMember));
	}
}
