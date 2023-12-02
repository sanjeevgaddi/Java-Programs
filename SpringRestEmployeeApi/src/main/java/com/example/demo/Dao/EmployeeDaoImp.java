package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository  
public class EmployeeDaoImp implements EmployeeDao { 

	EntityManager em; 

	@Autowired 
	public EmployeeDaoImp(EntityManager em) 
	{ 
		this.em=em; 
	} 
	@Override 
	public List<Employee> findAll() { 

		TypedQuery<Employee> query= em.createQuery("from Employee", Employee.class); 

		List<Employee> emplist=query.getResultList(); 

		return emplist; 

	}
	@Override
	public Employee findById(int id) {
		Employee ref=em.find(Employee.class, id);
		return ref;
	}
	@Override
	public Employee save(Employee theEmployee) {
		Employee ref=em.merge(theEmployee);
		return ref;
	}
	@Override
	public void delete(int id) {
		Employee ref=em.find(Employee.class, id);
		em.remove(ref);

	}
	@Override
	public Employee update(Employee theEmployee) {
		Employee ref=em.merge(theEmployee);
		return ref;
		
	} 

 

} 

