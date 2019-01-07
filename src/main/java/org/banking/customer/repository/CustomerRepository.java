/**
 * 
 */
package org.banking.customer.repository;

import org.banking.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
