package customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import customer.entity.Customer;
import customer.repository.CustomerJpaRepository;


@Controller
public class CustomerController {

	@Autowired
	private CustomerJpaRepository customerJpaRepository;
	
	@RequestMapping("/")
	public String index() {
		return "customer!";
	}
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("name", "SpringBlog from grinvi04");
		return "hello";
	}
	
	@RequestMapping("/blog")
	public String blog(Model model) {
		return "blog";
	}
	
	@RequestMapping("/post")
	public String post(Model model) {
		return "post";
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
