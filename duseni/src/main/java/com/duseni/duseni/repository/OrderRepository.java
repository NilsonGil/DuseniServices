package com.duseni.duseni.repository;

import org.springframework.data.repository.CrudRepository;

import com.duseni.duseni.entities.Request;

public interface OrderRepository extends CrudRepository<Request, Long> {

}
