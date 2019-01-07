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
public class Customer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 11997926279471994L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long customerId;

	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private Integer mobile;
	private String idProof;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Location location;

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
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
	}


	
}
