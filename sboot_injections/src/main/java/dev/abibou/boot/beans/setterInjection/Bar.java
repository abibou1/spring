package dev.abibou.boot.beans.setterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Bar {
	private Owner owner;
	
	public Bar() {
		System.out.println("Bar :: constructor");
	}



	@Autowired
	public void setOwner(Owner owner) {
		this.owner=owner;
	}

	@Override
	public String toString() {
		return "Bar is"+owner;
	}

}
