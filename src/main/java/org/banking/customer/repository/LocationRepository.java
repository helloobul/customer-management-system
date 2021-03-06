/**
 * 
 */
package org.banking.customer.repository;

import org.banking.customer.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ObulSubbaReddy Bhojja
 *
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {

}
