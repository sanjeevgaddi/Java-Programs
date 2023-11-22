package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PassengerPlane implements Plane {
	public PassengerPlane() {
		// TODO Auto-generated constructor stub
		System.out.println("PassengerPlane Created");
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "PassengerPlane Takeoff on Medium Sized Runway:-))))";
	}

}
