package com.duseni.duseni.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_users")
	@Column(name = "id_address")
	private Long id_address;

	@NotNull
	private String descripcion;

	@OneToOne(mappedBy = "address")
	private Member menber;
		
	@OneToOne(mappedBy = "delivery_address")
	private Request request ;
	
	@OneToOne(mappedBy = "address_association")
	private Association association;
	

	@ManyToOne
	@JoinColumn(name = "city_id")
	private City city;

	
	
	
	public Long getId_address() {
		return id_address;
	}

	public void setId_address(Long id_address) {
		this.id_address = id_address;
	}



	public Long getId() {
		return id_address;
	}

	public void setId(Long id) {
		this.id_address = id;
	}

	public Member getMenber() {
		return menber;
	}

	public void setMenber(Member menber) {
		this.menber = menber;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	public Request getRequest() {
		return request;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "Address [id=" + id_address + ", descripcion=" + descripcion + ", menber=" + menber + ", city=" + city + "]";
	}

	
}
