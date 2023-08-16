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
	
	@GetMapping("/loan")
	public String custormerLoan() {
		return "This Page shows the Loan Details";
	}
	
	@GetMapping("/statement")
	public String getBankStatement() {
		return "This Page shows Account Transactions";
	}
	
	@GetMapping("/balance")
	public String getBalance() {
		return "Your A/C Balance is : xxxxxx";
	}

}
