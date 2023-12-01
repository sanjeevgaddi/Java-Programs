package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Customer;

public interface CustomerDaoService {
	
	public List<Customer> findAll(); 
	public Customer  findById(int id);
	public Customer save(Customer theCustomer);
	public Customer update(Customer theCustomer);
	public void delete(int id);

}
