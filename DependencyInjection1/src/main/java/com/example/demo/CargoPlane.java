package com.example.demo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CargoPlane implements Plane{
	
	public CargoPlane() {
		// TODO Auto-generated constructor stub
		System.out.println("CargoPlane Created");
	}

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "CargoPlane is Taking off on Huge RunWay:-)";
	}

}
