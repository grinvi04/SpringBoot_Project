package customer.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

	List<Customer> findByLastName(String lastName);
}
