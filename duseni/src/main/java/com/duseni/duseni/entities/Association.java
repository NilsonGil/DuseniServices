package com.duseni.duseni.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Association {
	
	
	// IdentificationCard =  cedula
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_users")
		@Column(name = "id_association")
		private Long IdentificationCard;
		
		@NotNull
		private String  name;
	
		@NotNull
		private String email;
		@NotNull
		private String password;
		
		private String imageProfile;
		
				
		@OneToMany
		@JoinColumn(name = "products") // we need to duplicate the physical information
		private List<Product> products;
		
		@NotNull
		@OneToOne(cascade = CascadeType.ALL)
//		@JoinColumn(name = "id_address", referencedColumnName = "id_address")
		private Address address_association;
		
		
		public Long getIdentificationCard() {
			return IdentificationCard;
		}


		public void setIdentificationCard(Long identificationCard) {
			IdentificationCard = identificationCard;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getImageProfile() {
			return imageProfile;
		}


		public void setImageProfile(String imageProfile) {
			this.imageProfile = imageProfile;
		}





		public List<Product> getProducts() {
			return products;
		}


		public void setProducts(List<Product> products) {
			this.products = products;
		}


		
		


}
