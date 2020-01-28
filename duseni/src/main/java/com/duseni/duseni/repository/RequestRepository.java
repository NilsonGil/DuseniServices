package com.duseni.duseni.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Request;



public interface RequestRepository extends CrudRepository<Request, Long> {
	
	@Query(value = "select * from duseni.request  INNER JOIN (SELECT duseni.contribution.id_request FROM duseni.contribution "
			+ " left join  duseni.member  on  duseni.contribution.id_member =duseni.member.cedula_member"
			+ " where duseni.member.cedula_member = (:cedulaMember)) c on c.id_request = duseni.request.id_request", nativeQuery = true)
	Iterable<Request> getPedidosContribucionesMember(Long cedulaMember);
	
	@Query(value = "select name_product , total_aportado from ( select product_id_product,  sum(quantity) total_aportado  from duseni.request join   \r\n" + 
			" (select id_request, quantity FROM duseni.contribution  where  duseni.contribution.id_member = (:cedulaMember)) \r\n" + 
			" c on  duseni.request.id_request = c.id_request  GROUP BY duseni.request.product_id_product ) aportes join duseni.product on duseni.product.id_product = aportes.product_id_product ", nativeQuery = true)
	 Iterable<String[]> getTotalAportesPorProducto(Long cedulaMember);
	
	

}
