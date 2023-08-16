package dev.abibou.boot.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Car {
	
	public Car() {
		System.out.println("Car :: constructor");
	}
	
	public void startJourney() {
		boolean tripStatus = new Random().nextBoolean();
		
		if(tripStatus) {
			System.out.println("Good trip!!!");
		}
		else {
			System.out.println("Trip cancelled!");
		}
	}

}
