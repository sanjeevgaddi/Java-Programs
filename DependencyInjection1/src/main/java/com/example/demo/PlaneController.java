package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlaneController {
	Plane ref;
	
	@Autowired
	public PlaneController(@Qualifier("fighterPlane") Plane ref)
	{
		this.ref=ref;
	}
	
	
	@GetMapping("/getplane")
	public String planetakeoff()
	{
		return ref.takeoff();
	}

}
