package com.duseni.duseni.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {
	
	@Query(value = "SELECT * FROM duseni.member m where m.email_member=(:email) and m.password_member = (:password)", nativeQuery = true)
	Optional<Member> authenticationMember(String  email, String password);
	
	
	
}
