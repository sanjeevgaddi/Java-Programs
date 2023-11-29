package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
		StudentRepository ref;
		public StudentController(StudentRepository ref) {
			this.ref=ref;
		}
		@GetMapping("/insert")
		public String storestudent()
		{
			Student s1=new Student("Sanjeev",90,"San");
			ref.save(s1);
			return "Student "+ s1+"  data is Stored In Database";
		}
	

}
