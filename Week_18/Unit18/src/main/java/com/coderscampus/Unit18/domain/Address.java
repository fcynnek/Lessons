package com.coderscampus.Unit18.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class Address {

	private User user;
	// we need to add the user object because this is a foreign key and in order to be able to map it, we need to include it here [continues in user class]
	private Long userID;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String region;
	private String country;
	private String zipCode;
	
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	@Id 
	public Long getUserID() {
		return userID;
	}
	@Column(length = 200)
	public String getAddressLine1() {
		return addressLine1;
	}
	@Column(length = 200)
	public String getAddressLine2() {
		return addressLine2;
	}
	@Column(length = 100)
	public String getCity() {
		return city;
	}
	@Column(length = 100)
	public String getRegion() {
		return region;
	}
	@Column(length = 100)
	public String getCountry() {
		return country;
	}
	@Column(length = 15)
	public String getZipCode() {
		return zipCode;
	}
	
	
	public void setUser(User user) {
		this.user = user;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
