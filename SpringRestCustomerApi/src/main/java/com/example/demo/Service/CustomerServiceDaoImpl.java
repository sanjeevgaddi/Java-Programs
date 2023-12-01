package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.CustomerRepository;
import com.example.demo.Entity.Customer;
import jakarta.transaction.Transactional;

@Service
public class CustomerServiceDaoImpl implements CustomerDaoService{

	CustomerRepository ref; 

	@Autowired 
	public CustomerServiceDaoImpl(CustomerRepository ref) 
	{ 
		this.ref=ref; 
	} 

	@Override 
	public List<Customer> findAll() { 

		return ref.findAll(); 

	}

	@Override
	public Customer findById(int id) {
		
		Optional<Customer> op= ref.findById(id);
		Customer c=op.get();
		return c;
	}

	@Override
	public Customer save(Customer theCustomer) {
		
		return ref.save(theCustomer);
	}

	@Override
	public void delete(int id) {
		ref.deleteById(id);
	}

	@Override
	public Customer update(Customer theCustomer) {

		return ref.save(theCustomer);
	} 


}
