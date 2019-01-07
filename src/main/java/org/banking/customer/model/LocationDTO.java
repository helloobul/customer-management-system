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
public class LocationDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8565221284357305940L;

	@NotNull
	private String country;
	
	@NotNull
	private AddressDTO address;

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the address
	 */
	public AddressDTO getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(AddressDTO address) {
		this.address = address;
	}
}
