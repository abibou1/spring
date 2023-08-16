package dev.abibou.rest.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cibil")
public class CibilRequestController {
	@GetMapping("/score")
	public ResponseEntity<?> getCibil(@RequestHeader(name="Host", required=false, defaultValue="N/A") String host, @RequestParam("name") String name, @RequestParam("pan") String pan){
		String response ="";
		HttpStatus status;
		
		if(pan.length() == 10) {
			response = String.format("Hi %s, your CIBIL Score for PAN: %s is 803", name, pan);
			status = HttpStatus.OK;
		}
		else {
			response = String.format("Hi %s, please submit a valid PAN Number", name);
			status = HttpStatus.BAD_REQUEST;
		}
		
		response = response + "\n"
				+ "host = " + host + "\n";
		
		return new ResponseEntity<String>(response, status);
	}
	
	

}
