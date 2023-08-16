package dev.abibou.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	
	@GetMapping("/home")
	public String homePage() {
		return "Welcome to State Bank";
	}
	
	@GetMapping("/care")
	public String customerCare() {
		return "Contact Customer Care @ 1800-125-1477";
	}
	
	@GetMapping("/admin")
	public String getBankStatement() {
		return "This is the admin page";
	}
	
	@GetMapping("/manager")
	public String custormerLoan() {
		return "This is the manager page.";
	}
	
	@GetMapping("/customer")
	public String getBalance() {
		return "This is the customer page";
	}

}
