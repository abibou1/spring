package dev.abibou.boot.beans.constructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private Admin admin;
	
	public User() {
		System.out.println("User :: constructor");
	}
	
	@Autowired
	public User(Admin admin) {
		System.out.println("User :: field constructor");
		this.admin = admin;
	}
	
	public void checkUser() {
		boolean adminStatus = admin.isAdmin();
		
		if(adminStatus) {
			System.out.println("This user is admin.");
		}
		else {
			System.err.println("This user is not admin.");
		}
	}

}
