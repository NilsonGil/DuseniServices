package com.duseni.duseni.repository;

import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Member;

public interface MemberRepository extends CrudRepository<Member, Long> {

}
