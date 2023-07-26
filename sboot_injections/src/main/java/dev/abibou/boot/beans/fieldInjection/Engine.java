package dev.abibou.boot.beans.fieldInjection;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public Engine() {
		System.out.println("Engine :: constructor");
	}
	
	public boolean startEngine() {
		System.out.println("starting engine");
		boolean engineStatus = new Random().nextBoolean();
		return engineStatus;
	}

}
