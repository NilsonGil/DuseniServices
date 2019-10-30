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
	@Column(name = "id")
	private int id;

	@NotNull
	private String descripcion;

	@OneToOne(mappedBy = "address")
	private Member menber;

	@ManyToOne
	@JoinColumn(name = "city_id", insertable = false, updatable = false)
	private City city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Address [id=" + id + ", descripcion=" + descripcion + ", menber=" + menber + ", city=" + city + "]";
	}

	
}
