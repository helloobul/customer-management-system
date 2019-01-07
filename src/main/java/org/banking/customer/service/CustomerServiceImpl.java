/**
 * 
 */
package org.banking.customer.service;

import java.util.Optional;

import org.banking.customer.entity.Customer;
import org.banking.customer.exception.CustomerNotFoundException;
import org.banking.customer.model.CustomerDTO;
import org.banking.customer.repository.AddressRepository;
import org.banking.customer.repository.CustomerRepository;
import org.banking.customer.repository.LocationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AddressRepository AddressRepositora;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDto) {
		ModelMapper mapper = new ModelMapper();
		Customer customer = customerRepository.save(mapper.map(customerDto, Customer.class));

		return mapper.map(customer, CustomerDTO.class);
	}

	@Override
	public CustomerDTO getCustomerDetails(Long customerId) {
		Optional<Customer> optcust = customerRepository.findById(customerId);
		Customer customer = optcust
			.orElseThrow(() -> new CustomerNotFoundException("Customer Not found. customer id - " + customerId));
		ModelMapper mapper = new ModelMapper();
		return mapper.map(customer, CustomerDTO.class);
	}

	@Override
	public CustomerDTO updateCustomer(CustomerDTO customerDto) {
		ModelMapper mapper = new ModelMapper();
		Customer customer = customerRepository.save(mapper.map(customerDto, Customer.class));
		return mapper.map(customer, CustomerDTO.class);
	}

	@Override
	public void deleteCustomer(Long customerId) {
		customerRepository.deleteById(customerId);
	}

	/**
	 * @return the customerRepository
	 */
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	/**
	 * @param customerRepository
	 *            the customerRepository to set
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/**
	 * @return the locationRepository
	 */
	public LocationRepository getLocationRepository() {
		return locationRepository;
	}

	/**
	 * @param locationRepository
	 *            the locationRepository to set
	 */
	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}

	/**
	 * @return the addressRepositora
	 */
	public AddressRepository getAddressRepositora() {
		return AddressRepositora;
	}

	/**
	 * @param addressRepositora
	 *            the addressRepositora to set
	 */
	public void setAddressRepositora(AddressRepository addressRepositora) {
		AddressRepositora = addressRepositora;
	}

}
