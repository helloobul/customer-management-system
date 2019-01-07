/**
 * 
 */
package org.banking.customer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@Entity
public class Location implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4073159941724170462L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long locationId;
	private String country;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}


}
