/**
 * 
 */
package org.banking.customer.repository;

import org.banking.customer.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
