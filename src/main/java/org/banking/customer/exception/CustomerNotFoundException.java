/**
 * 
 */
package org.banking.customer.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)

public class CustomerNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6610900343319260548L;


	public CustomerNotFoundException(String message) {
		super(message);
	}

}
