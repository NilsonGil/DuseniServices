package com.duseni.duseni.controller;

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
public class AuthenticationController {
	
	
	@Autowired
	private  MemberRepository	memberRepository;
	
	

	
	@GetMapping(value = "/authenticationMember/{email}/{password}")
	public ResponseEntity<Collection<Member>> authenticateForumUser(@PathVariable String email,	@PathVariable String password) {
		Collection<Member> member = memberRepository.authentication(email, password);
		return ResponseEntity.ok().body(member);
	}
	
	
	

}