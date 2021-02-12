package com.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//mark class as an Entity
@Entity

//defining class as Table name
@Table
public class Countries {
	//defining id as primary key
	@Id
	@Column
	private int countryid;
	
	@Column
	private String country;
	
	@Column
	private String capital;
	
	public int getCountryId() {
		return countryid;
	}
	public void setCountryId(int countryid) {
		this.countryid = countryid;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	

}
