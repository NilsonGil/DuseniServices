package com.duseni.duseni.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_users")
	private Long id_product;

	@NotNull
	private String nameProduct;

	@NotNull
	private String productImage;
	
	@NotNull
	@OneToOne(mappedBy = "product")
	private Request request;
	
	public Long getIdProduct() {
		return id_product;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	
	
	public void setIdProduct(Long idProduct) {
		this.id_product = idProduct;
	}

	@Override
	public String toString() {
		return "Product [idProduct=" + id_product + ", nameProduct=" + nameProduct + ", productImage=" + productImage
				+ "]";
	}

}
