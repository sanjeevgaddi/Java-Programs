package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Customer;
import com.example.demo.Service.CustomerDaoService;

@RestController
@RequestMapping("/custapi")
public class CustomerController {
	
	CustomerDaoService cds;
	
	public CustomerController(CustomerDaoService cds) {
		 this.cds=cds;
	}
	
	@GetMapping("/getallcustomers")
	public List<Customer> findallCustomers()
	{
		return cds.findAll();
	}
	
	@GetMapping("/getcustbyid/{custid}")
	public Customer findCustomersById(@PathVariable int custid)
	{
		return cds.findById(custid);
	}
	
	@PostMapping("/savecust")
	public Customer saveCustomer(@RequestBody Customer cust)
	{
		return cds.save(cust);
	}
	
	@PutMapping("/updatecust")
	public Customer updateCustomer(@RequestBody Customer cust)
	{
		return cds.update(cust);
	}
	
	@DeleteMapping("/deletecust/{custid}")
	public String deleteCustomer(@PathVariable int custid)
	{
		cds.delete(custid);
		return "Delete Success";
	}
	
	
	

}
