package dev.abibou.rest.controllers;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personal/test")
public class AgeRestController {
	
	@GetMapping("/age/{name}/{yob}")
	public ResponseEntity<String> getAge(@PathVariable("name") String name, @PathVariable("yob") int yob){
		String msg;
		HttpStatus status;
		
		if(isValidYearOfBirth(yob)) {
			int age = calculateAge(yob);
			msg = String.format("Hi %s, you are %d years of age , and are eligible for Insurance", name, age);
			status = HttpStatus.OK;
		}
		else {
			msg = String.format("Hi %s, your submitted Year of Birth (%d) is not Valid", name, yob);
			status = HttpStatus.BAD_REQUEST;
		}
		
		return new ResponseEntity<String>(msg, status);
	}
	
	private int calculateAge(Integer yob) {    
	    return getCurrentYear() - yob;
	}
	
	private boolean isValidYearOfBirth(Integer yob) {
		return yob < getCurrentYear();
	}
	
	
	private static int getCurrentYear() {
		LocalDate date = LocalDate.now();
	    return date.getYear();
	}

}
