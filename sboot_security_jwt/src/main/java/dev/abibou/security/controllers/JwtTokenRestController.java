package dev.abibou.security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import dev.abibou.security.models.LoginRequest;
import dev.abibou.security.utils.JwtUtil;

@RestController
public class JwtTokenRestController {
//	@Autowired
//	private JwtUtil jwtUtil;
//	
//	@Autowired
//	AuthenticationManager authManager;
	
	@PostMapping("/authenticate")
	public String generateToken(@RequestBody LoginRequest loginRequest) {
		
		if(loginRequest.getUsername() != null && loginRequest.getPassword() != null) {
			return "this is an authentic user";
		}
		
		return "Authentication failed";
	}
	
	
	

}
