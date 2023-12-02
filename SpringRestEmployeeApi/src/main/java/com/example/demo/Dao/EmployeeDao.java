package com.example.demo.Dao;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeDao { 

	public List<Employee> findAll(); 
	public Employee  findById(int id);
	public Employee save(Employee theEmployee);
	public Employee update(Employee theEmployee);
	public void delete(int id);

} 
