package com.duseni.duseni.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Request;



public interface RequestRepository extends CrudRepository<Request, Long> {
	
	@Query(value = "select * from duseni.request  INNER JOIN (SELECT duseni.contribution.id_request FROM duseni.contribution "
			+ " left join  duseni.member  on  duseni.contribution.id_member =duseni.member.cedula_member"
			+ " where duseni.member.cedula_member = (:cedulaMember)) c on c.id_request = duseni.request.id_request", nativeQuery = true)
	Iterable<Request> getPedidosContribucionesMember(Long cedulaMember);
	

}
