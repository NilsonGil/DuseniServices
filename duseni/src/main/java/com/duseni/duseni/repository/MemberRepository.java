package com.duseni.duseni.repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
	
	@Query(value = "SELECT * FROM duseni.member m where m.email=(:email) and m.password = (:password)", nativeQuery = true)
	Collection<Member> authentication(String  email, String password);
	
	
	
}
