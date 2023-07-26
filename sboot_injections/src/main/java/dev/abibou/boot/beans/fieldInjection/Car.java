package dev.abibou.boot.beans.fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Engine engine;
	
	public Car() {
		System.out.println("Car :: contructor");
	}
	
	public void startTrip() {
		boolean engineStatus = engine.startEngine();
		
		if(engineStatus) {
			System.out.println("Nice trip!");
		}
		else {
			System.err.println("Trip cancelled!");
		}
	}

}
