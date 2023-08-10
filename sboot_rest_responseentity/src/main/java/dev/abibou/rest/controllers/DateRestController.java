package dev.abibou.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateRestController {
	
	@GetMapping("/today")
	public ResponseEntity<String> getDate(){
		LocalDateTime dateTimeObj = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
		String dateTime = formatter.format(dateTimeObj);
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("company", "personal");
		headers.add("today", dateTime);
		
		return new ResponseEntity<String>("Hello", headers, HttpStatus.OK);
		
	}

}
