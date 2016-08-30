package customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import customer.CustomerJpaRepository;
import customer.entity.Customer;


@RestController
public class CustomerController {

	@Autowired
	private CustomerJpaRepository customerJpaRepository;
	
	@RequestMapping("/")
	public String index() {
		return "customer!";
	}
	
	@RequestMapping("/add")
	public Customer add(Customer customer) {
		Customer customerData = customerJpaRepository.save(customer);
		
		return customerData;
	}
	
	@RequestMapping("/list")
	public List<Customer> list(Model model) {
		List<Customer> customerList = customerJpaRepository.findAll();
		
		return customerList;
	}
	
}
