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
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_users")
	@Column(name = "id_request")
	private Long id_request;
	@NotNull
	private int  quantity;
	@NotNull
	private Date dateOrder;
	@NotNull
	private Date dateLimit;
	@NotNull
	private double unitPrice;
	@NotNull
	private boolean isActivo;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;

}
