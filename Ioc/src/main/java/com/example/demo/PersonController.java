package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	Person p;
	
	@Autowired
	public PersonController(Person p) {
		this.p=p;
	}
	
	@GetMapping("/getperson")
	public Person displpayPerson()
	{  
		return p;
	}
	
}



