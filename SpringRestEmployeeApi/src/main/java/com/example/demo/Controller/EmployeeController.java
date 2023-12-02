package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeDaoService;

@RestController 
@RequestMapping("/empapi")
public class EmployeeController { 

	EmployeeDaoService eds; 

	@Autowired 
	public EmployeeController(EmployeeDaoService eds) { 

		this.eds=eds; 

	} 

	
	@GetMapping("/getallemployees") 
		public List<Employee> findAllEmployees() 
	{ 
			return eds.findAll(); 
	} 
	
	@GetMapping("/getempbyid/{empid}")
	public Employee findemployeeById(@PathVariable int empid)
	{
		return eds.findById(empid);
		
	}

	 @PostMapping("/saveemp")
	 public Employee saveEmployee(@RequestBody Employee emp)
	 {
		 return eds.save(emp);
	 }
	 
	 @PutMapping("/updateemp")
	 public Employee updateEmployee(@RequestBody Employee emp)
	 {
		 return eds.save(emp);
	 }
	 
	 @DeleteMapping("/deleteemp/{empid}")
	 public String deleteEmployee(@PathVariable int empid)
	 {
		 	eds.delete(empid);
		 	return "Delete Success";
	 }
} 

