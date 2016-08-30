package customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import customer.entity.Customer;

public interface CustomerJpaRepository extends JpaRepository<Customer, Integer> {
	

}
