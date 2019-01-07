/**
 * 
 */
package org.banking.customer.controller;

import java.net.URI;

import javax.validation.Valid;

import org.banking.customer.model.CustomerDTO;
import org.banking.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@GetMapping(path = "/customer/{customerId}")
	public ResponseEntity<CustomerDTO> getCustomerDeatils(@PathVariable long customerId) {
		return new ResponseEntity<CustomerDTO>(customerService.getCustomerDetails(customerId), HttpStatus.OK);
	}

	@PostMapping(path = "/customer/create")
	public ResponseEntity<CustomerDTO> createCustomer(@RequestBody @Valid CustomerDTO customer) {
		customer =customerService.createCustomer(customer);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
			.path("/{id}")
			.buildAndExpand(customer.getCustomerId())
			.toUri();
		return ResponseEntity.created(location).build();
	}

	@PutMapping(path = "/customer/update")
	public ResponseEntity<CustomerDTO> updateCustomer(@RequestBody CustomerDTO user) {
		return new ResponseEntity<CustomerDTO>(customerService.updateCustomer(user), HttpStatus.OK);
	}

	@DeleteMapping(path = "/customer/{customerId}")
	public ResponseEntity<?> deleteCustomer(@PathVariable long customerId) {
		customerService.deleteCustomer(customerId);
		return new ResponseEntity<Object>(HttpStatus.ACCEPTED);
	}

}
