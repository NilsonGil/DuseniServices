package com.duseni.duseni.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.validation.constraints.NotNull;

import com.duseni.duseni.entitiesPK.ContributePK;

// clase de aportes


@Entity
@IdClass(value = ContributePK.class)
public class Contribute {
	
	
	/**
	 * id compuesto entre el id del miembro y el del id del producto
	 */
	@Id
	private long idMember;
	/**
	 * id compuesto entre el id del miembro y el del id del producto
	 */
	@Id
	private long idRequest;

	/**
	 * cantidad de productos del aporte
	 */
	@NotNull
	private int  quantity;
	
	
	/**
	 * Dia en que se dio el aporte
	 */
	@NotNull
	private Date dateOrder;
	

	
	public long getIdMember() {
		return idMember;
	}

	public void setIdMember(long idMember) {
		this.idMember = idMember;
	}

	public long getIdRequest() {
		return idRequest;
	}

	public void setIdRequest(long idRequest) {
		this.idRequest = idRequest;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	@Override
	public String toString() {
		return "Contribute [idMember=" + idMember + ", idRequest=" + idRequest + ", quantity=" + quantity
				+ ", dateOrder=" + dateOrder + "]";
	}

	
	

	
	
	
	
	
	

}
