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

import com.duseni.duseni.entities.Contribution;
import com.duseni.duseni.persistence.JsonManager;
import com.duseni.duseni.repository.ContributionRepository;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class ContributionServices {
	@Autowired
	private ContributionRepository contributionRepository;

	// ****** CRUD MIEMBROS *******//

	/*
	 * AGREGA UN NUEVO MIEBRO
	 */
	@PostMapping(value = "/addContribution")
	public String addContribution(@Valid @RequestBody Contribution contribution) {
		return JsonManager.toJson(contributionRepository.save(contribution));
	}

	/*
	 * BUSCAR MIEMBRO POR ID
	 */
	@GetMapping(value = "/contribution/{id}")
	public String getContribution(@PathVariable Long id) {
		Optional<Contribution> contributionFound = contributionRepository.findById(id);
		return JsonManager.toJson(contributionFound.get());
	}

	/*
	 * EDITA UN MIEMBRO
	 */
	@PutMapping(value = "/editContribution")
	public String editContribution(@Valid @RequestBody Contribution contribution) {
		return JsonManager.toJson(contributionRepository.save(contribution));
	}

	/*
	 * ELIMINA UN MIEMBRO POR ID
	 */
	@DeleteMapping(value = "/removeContribution/{id}")
	public void removeContribution(@PathVariable Long id) {
		contributionRepository.deleteById(id);
	}

	// ****** CONSULTAS DIFERENTES *******//

	/*
	 * OBTIENE TODOS LOS MIEMBROS
	 */
	@GetMapping(value = "/getAllContribution")
	public String getAllContribution() {
		return JsonManager.toJson(contributionRepository.findAll());
	}
}
