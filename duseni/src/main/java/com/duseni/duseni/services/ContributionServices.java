package com.duseni.duseni.services;

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
	 * AGREGA UN NUEVO MIEBRO [INCOMPLETOO]
	 */
	@PostMapping(value = "/addContribution")
	public String addContribution(@Valid @RequestBody Contribution contribution) {
		return JsonManager.toJson(contributionRepository.save(contribution));
	}

	/*
	 * BUSCAR MIEMBRO POR ID
	 */
	@GetMapping(value = "/contribution/{idMember}/{idRequest}")
	public String getContribution(@PathVariable Long idMember, @PathVariable Long idRequest) {
		return JsonManager.toJson(contributionRepository.findByCompositeId(idMember, idRequest));
	}

	/*
	 * EDITA UN MIEMBRO
	 */
	@PutMapping(value = "/editContribution")
	public String editContribution(@Valid @RequestBody Contribution contribution) {
		return JsonManager.toJson(contributionRepository.save(contribution));
	}

	/*
	 * ELIMINA UN MIEMBRO POR ID_MEMBER y por ID_REQUEST
	 */
	@DeleteMapping(value = "/removeContribution/{idMember}/{idRequest}")
	public void removeContribution(@PathVariable Long idMember, @PathVariable Long idRequest){
		Contribution contributionFound = new Contribution();
		contributionFound.setId_member(idMember);
		contributionFound.setId_request(idRequest);
		if (!contributionRepository.findByCompositeId(idMember, idRequest).isEmpty()) {
			contributionRepository.delete(contributionFound);
		}
	}

	// ****** CONSULTAS DIFERENTES *******//

	/*
	 * OBTIENE TODOS LOS MIEMBROS
	 */
	@GetMapping(value = "/allContributions")
	public String getAllContribution() {
		return JsonManager.toJson(contributionRepository.findAll());
	}

//	@GetMapping(value = "/addRemoveDiscussionToFavorites/{idDiscussion}/{idUser}")
//	public void addRemoveDiscussionToFavorites(@PathVariable Long idDiscussion, @PathVariable Long idUser) {
//		UserFavDiscussion ufd = new UserFavDiscussion();
//		ufd.setIdForumDiscussion(idDiscussion);
//		ufd.setIdUser(idUser);
//		if (!userFavDiscussionsRepository.finByCompositeId(idDiscussion, idUser).isEmpty()) {
//			userFavDiscussionsRepository.delete(ufd);
//		} else {
//			userFavDiscussionsRepository.save(ufd);
//		}
//	}
}
