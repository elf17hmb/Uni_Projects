package whz.pti.eva.customer.domain;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository<Customer, Long>{
	Optional<Customer> findByLoginName(String loginname);

}
