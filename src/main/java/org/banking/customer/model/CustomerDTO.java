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
public class CustomerDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1856319609712775528L;

	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;

	private String middleName;
	
	@NotNull
	private String email;
	
	@NotNull
	private Integer mobile;
	
	private String idProof;
	
	private Long customerId;
	
	/*@NotNull
	private IdentificationDTO identification;*/
	
	@NotNull
	private LocationDTO location;

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerDTO [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", email=" + email + ", mobile=" + mobile + ", location="
				+ location + "]";
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the mobile
	 */
	public Integer getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the location
	 */
	public LocationDTO getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(LocationDTO location) {
		this.location = location;
	}

	/**
	 * @return the idProof
	 */
	public String getIdProof() {
		return idProof;
	}

	/**
	 * @param idProof the idProof to set
	 */
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}

	/**
	 * @return the customerId
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

}
