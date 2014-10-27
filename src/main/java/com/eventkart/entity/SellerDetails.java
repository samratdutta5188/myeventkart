package com.eventkart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seller_info")
public class SellerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "seller_id")
	private int sellerId;

	@Column(name = "seller_name", nullable = false)
	private String sellerName;

	@Column(name = "seller_description", nullable = false)
	private String sellerDescription;

	@Column(name = "address1", nullable = false)
	private String address1;

	@Column(name = "address2", nullable = false)
	private String address2;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state", nullable = false)
	private String state;

	@Column(name = "country", nullable = false)
	private String country;

	@Column(name = "pincode", nullable = false)
	private int pincode;

	@Column(name = "landmark")
	private String landmark;

	@Column(name = "phone1", nullable = false)
	private int phone1;

	@Column(name = "phone2")
	private int phone2;

	@Column(name = "primaryemail", nullable = false)
	private String primaryEmail;

	@Column(name = "secondaryemail")
	private String secondaryEmail;

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public String getSellerDescription() {
		return sellerDescription;
	}

	public void setSellerDescription(String sellerDescription) {
		this.sellerDescription = sellerDescription;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getPhone1() {
		return phone1;
	}

	public void setPhone1(int phone1) {
		this.phone1 = phone1;
	}

	public int getPhone2() {
		return phone2;
	}

	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}

	public String getPrimaryEmail() {
		return primaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		this.primaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

}
