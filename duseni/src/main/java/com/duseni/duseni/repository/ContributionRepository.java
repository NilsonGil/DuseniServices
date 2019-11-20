package com.duseni.duseni.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Contribution;

public interface ContributionRepository extends CrudRepository<Contribution, Long> {

	@Query(value = "SELECT * FROM  duseni.contribution " + 
			"where id_member = (:id_member) and  id_request = (:id_request)", nativeQuery = true)
	Collection<Contribution> findByCompositeId(long id_member, long id_request);
	@Query(value = "SELECT * FROM  duseni.contribution", nativeQuery = true)
	Collection<Contribution> findAll(long id_member, long id_request);
	
}
