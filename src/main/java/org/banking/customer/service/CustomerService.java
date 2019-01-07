/**
 * 
 */
package org.banking.customer.service;

import org.banking.customer.model.CustomerDTO;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
public interface CustomerService {

	public CustomerDTO createCustomer(CustomerDTO customer);

	public CustomerDTO getCustomerDetails(Long customerId);

	public CustomerDTO updateCustomer(CustomerDTO customer);

	public void deleteCustomer(Long customerId);

}
