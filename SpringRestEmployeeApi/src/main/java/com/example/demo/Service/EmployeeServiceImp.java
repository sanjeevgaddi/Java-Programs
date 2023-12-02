package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.EmployeeDao;
import com.example.demo.Entity.Employee;

import jakarta.transaction.Transactional;

@Service 
public class EmployeeServiceImp implements EmployeeDaoService
{ 
	EmployeeDao edao; 

	@Autowired 
	public EmployeeServiceImp(EmployeeDao edao) 
	{ 
		this.edao=edao; 
	} 

	@Override 
	@Transactional
	public List<Employee> findAll() { 

		return edao.findAll(); 

	}

	@Override
	@Transactional
	public Employee findById(int id) {
		
		return edao.findById(id);
	}

	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		
		return edao.save(theEmployee);
	}

	@Override
	@Transactional
	public void delete(int id) {
		edao.delete(id);
	}

	@Override
	@Transactional
	public Employee update(Employee theEmployee) {

		return edao.save(theEmployee);
	} 

}  

