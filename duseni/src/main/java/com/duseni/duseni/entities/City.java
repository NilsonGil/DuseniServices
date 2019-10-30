package com.duseni.duseni.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_users")
	@Column(name = "id")
	private int id;
	@NotNull
	private String name;
	@NotNull
	private String postalCode;
		
	 @OneToMany
	 @JoinColumn(name = "city_id") // we need to duplicate the physical information
	 private List<Address> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public List<Address> getItems() {
		return items;
	}

	public void setItems(List<Address> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", postalCode=" + postalCode + ", items=" + items + "]";
	}




	
	
	

}
