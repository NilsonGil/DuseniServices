package com.duseni.duseni.services;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.duseni.duseni.entities.Member;
import com.duseni.duseni.repository.MemberRepository;


@CrossOrigin (origins = { "http://localhost:4200" })
@RestController
public class AuthenticationServices {
	
	
	@Autowired
	private  MemberRepository	memberRepository;
	
//	@GetMapping(value = "/authenticationMember/{email}/{password}")
//	public ResponseEntity<Collection<Member>> authenticateForumUser(@PathVariable String email,	@PathVariable String password) {
//		Optional<Member> member = memberRepository.authentication(email, password);
//		return ResponseEntity.ok().body(member);
//	}
	/*
	 * AUTENTICA AL ADMIN
	 */
	@GetMapping(value = "/authenticationMember2/{email}/{password}")
	public ResponseEntity<Collection<Member>> authenticateForumUser2(@PathVariable String email,	@PathVariable String password) {
		System.out.println("llgeo" + email + "- "+ password);
		Collection<Member> member = memberRepository.authentication(email, password);
		
		System.out.println(member + "");
//		if(member.get() != null) {
//			return true;
//		}
		return ResponseEntity.ok().body(member);
	}
	



}
