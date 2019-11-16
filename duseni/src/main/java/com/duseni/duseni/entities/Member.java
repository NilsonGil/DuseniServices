package com.duseni.duseni.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Member {
	
	
	// IdentificationCard =  cedula
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "sequence_member")
	private Long IdentificationCard;
	
	@NotNull
	private String  firstName;
	
	private String  secondtName;
	
	@NotNull
	private String  firstLastName;
	@NotNull
	private String  secondtLastName;
	@NotNull
	private String email;
	@NotNull
	private String password;
	
	private String imageProfile;
	@NotNull
	private Character gender;
	
	private Boolean isActiveUser;
	@NotNull
	private int phoneNumberOne;
	private int phoneNumberTwo;
	@NotNull
	private Date dateOfBirth;
	
	@NotNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_address", referencedColumnName = "id_address")
	private Address address;

	public Long getIdentificationCard() {
		return IdentificationCard;
	}

	public void setIdentificationCard(Long identificationCard) {
		IdentificationCard = identificationCard;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondtName() {
		return secondtName;
	}

	public void setSecondtName(String secondtName) {
		this.secondtName = secondtName;
	}

	public String getFirstLastName() {
		return firstLastName;
	}

	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}

	public String getSecondtLastName() {
		return secondtLastName;
	}

	public void setSecondtLastName(String secondtLastName) {
		this.secondtLastName = secondtLastName;
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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Boolean getIsActiveUser() {
		return isActiveUser;
	}

	public void setIsActiveUser(Boolean isActiveUser) {
		this.isActiveUser = isActiveUser;
	}

	public int getPhoneNumberOne() {
		return phoneNumberOne;
	}

	public void setPhoneNumberOne(int phoneNumberOne) {
		this.phoneNumberOne = phoneNumberOne;
	}

	public int getPhoneNumberTwo() {
		return phoneNumberTwo;
	}

	public void setPhoneNumberTwo(int phoneNumberTwo) {
		this.phoneNumberTwo = phoneNumberTwo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Member [IdentificationCard=" + IdentificationCard + ", firstName=" + firstName + ", secondtName="
				+ secondtName + ", firstLastName=" + firstLastName + ", secondtLastName=" + secondtLastName + ", email="
				+ email + ", password=" + password + ", imageProfile=" + imageProfile + ", gender=" + gender
				+ ", isActiveUser=" + isActiveUser + ", phoneNumberOne=" + phoneNumberOne + ", phoneNumberTwo="
				+ phoneNumberTwo + ", dateOfBirth=" + dateOfBirth + ", address=" + address + "]";
	}

	
	
	
	
	
	
	

}
