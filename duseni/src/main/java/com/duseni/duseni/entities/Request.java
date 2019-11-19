package com.duseni.duseni.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "contador_id_request")
	private Long id_request;
	@NotNull
	private String description;
	@NotNull
	private Date creation_date_request;
	@NotNull
	private Date limit_date_request;
	@NotNull
	private double required_quantity;

	/********* GETTERS Y SETTERS *******/

	@NotNull
	@OneToOne(cascade = CascadeType.PERSIST)
	private Address delivery_address;

	@NotNull
	@OneToOne
	private Product product;

	@NotNull
	private boolean is_active;

	@NotNull
	private double price_per_unit_to_pay;

	public Long getId_request() {
		return id_request;
	}

	public void setId_request(Long id_request) {
		this.id_request = id_request;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreation_date_request() {
		return creation_date_request;
	}

	public void setCreation_date_request(Date creation_date_request) {
		this.creation_date_request = creation_date_request;
	}

	public Date getLimit_date_request() {
		return limit_date_request;
	}

	public void setLimit_date_request(Date limit_date_request) {
		this.limit_date_request = limit_date_request;
	}

	public Address getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(Address delivery_address) {
		this.delivery_address = delivery_address;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public boolean isIs_active() {
		return is_active;
	}

	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

	public double getPrice_per_unit_to_pay() {
		return price_per_unit_to_pay;
	}

	public void setPrice_per_unit_to_pay(double price_per_unit_to_pay) {
		this.price_per_unit_to_pay = price_per_unit_to_pay;
	}

	public double getRequired_Quantity() {
		return required_quantity;
	}

	public void setRequired_Quantity(double quantity) {
		this.required_quantity = quantity;
	}

}
