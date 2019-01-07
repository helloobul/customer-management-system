/**
 * 
 */
package org.banking.customer.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
public class AddressDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3797836176150718646L;

	@NotNull
	private String name;

	@NotNull
	private String houseNumber;

	@NotNull
	private String street;

	@NotNull
	private String city;

	@NotNull
	private String state;

	@NotNull
	private String zip;

	/**
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * @param houseNumber
	 *            the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip
	 *            the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AddressDTO [name=" + name + ", houseNumber=" + houseNumber + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + "]";
	}

}
