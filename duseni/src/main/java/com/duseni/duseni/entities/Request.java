package com.duseni.duseni.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

// esta es la clase de pedido, no pude guardar la calse como order, asi que lo puse como request (Solicitud)

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_request")
	@Column(name = "id_request")
	private Long id_request;
	@NotNull
	private String description;
	@NotNull
	private Date creation_date_request;
	@NotNull
	private Date limit_date_request;
	
	@NotNull 
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "delivery_address", referencedColumnName = "id_address")
	private Address delivery_address;
	
	/*@NotNull
	@OneToOne
	private RequestState requestState;*/
	
	@NotNull
	@OneToOne
	@JoinColumn(name = "id_product", referencedColumnName = "id_product")
	private Product product;
	
	@NotNull
	private boolean is_active;

}
