package dev.abibou.boot.beans.constructorInjection;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Admin {
	
	public Admin() {
		System.out.println("");
	}

	public boolean isAdmin() {
		System.out.println("Checking admin status...");
		boolean adminStatus = new Random().nextBoolean();
		return adminStatus;
	}

}
