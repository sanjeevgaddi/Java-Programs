package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>{

}
