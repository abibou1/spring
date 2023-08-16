package dev.abibou.boot.beans.setterInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Owner {
	@Value("Mariane")
	String name;
	
	public Owner() {
		System.out.println("Owner :: constructor");
	}

	@Override
	public String toString() {
		return " owned by "+name;
	}
	
}
