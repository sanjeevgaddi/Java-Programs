package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CargoPlane  implements Plane{

	@Override
	public String takeoff() {
		// TODO Auto-generated method stub
		return "CargoPlane is Taking off on Huge RunWay:-)";
	}

}
