package org.banking.customer.model;

import javax.validation.constraints.NotNull;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
public class IdentificationDTO {

	@NotNull
	private String idType;
	
	@NotNull
	private String id;

	/**
	 * @return the idType
	 */
	public String getIdType() {
		return idType;
	}

	/**
	 * @param idType
	 *            the idType to set
	 */
	public void setIdType(String idType) {
		this.idType = idType;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "IdentificationDTO [idType=" + idType + ", id=" + id + "]";
	}
	
	
}
