package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class FighterPlane implements Plane {
	
	public FighterPlane() {
		// TODO Auto-generated constructor stub
		System.out.println("FighterPlane Created");
	}
	
	

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "Fighterplane TakeOff on a small Runway:-)))";
	}

}
