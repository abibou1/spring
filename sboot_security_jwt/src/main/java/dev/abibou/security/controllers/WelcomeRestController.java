package dev.abibou.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public String sayWelcome() {
		return "Welcome to Wipro";
	}
	
	@GetMapping("/greet")
	public String sendGreetings() {
		return "Greetings from Wipro";
	}

}
