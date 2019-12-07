package com.duseni.duseni.services;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.duseni.duseni.entities.Association;
import com.duseni.duseni.entities.Member;
import com.duseni.duseni.repository.AssociationRepository;
import com.duseni.duseni.repository.MemberRepository;


@CrossOrigin (origins = { "http://localhost:4200" })
@RestController
public class AuthenticationServices {
	
	
	@Autowired
	private  MemberRepository	memberRepository;
	@Autowired
	private AssociationRepository associationRepository;
	
//	@GetMapping(value = "/authenticationMember/{email}/{password}")
//	public ResponseEntity<Collection<Member>> authenticateForumUser(@PathVariable String email,	@PathVariable String password) {
//		Optional<Member> member = memberRepository.authentication(email, password);
//		return ResponseEntity.ok().body(member);
//	}
	
	/*
	 * AUTENTICA AL ADMIN
	 */
	@GetMapping(value = "/authenticationAdmin/{email}/{password}")
	public ResponseEntity<Collection<Association>> authenticationAdmin(@PathVariable String email,	@PathVariable String password) {
		System.out.println("llegó --> " + email + " *** "+ password);
		Collection<Association> association = associationRepository.authenticationAdmin(email, password);
		
		return ResponseEntity.ok().body(association);
	}
	
	/*
	 * AUTENTICA AL MIEMBRO
	 */
	@GetMapping(value = "/authenticationMember/{email}/{password}")
	public ResponseEntity<Collection<Member>> authenticateMember(@PathVariable String email,	@PathVariable String password) {
		System.out.println("llegó --> " + email + " *** "+ password);
		Collection<Member> member = memberRepository.authenticationMember(email, password);
		
		System.out.println(member + "");
//		if(member.get() != null) {
//			return true;
//		}
		return ResponseEntity.ok().body(member);
	}
	



}
