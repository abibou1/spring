package dev.abibou.rest.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.abibou.rest.entity.Ticket;
import dev.abibou.rest.models.Passenger;


@RestController
@RequestMapping("/irctc")
public class TicketRestController {
	
	@PostMapping(path = "/ticket/new",
			consumes = {"application/json", "application/xml"},
	         produces = {"application/json", "application/xml"})
	public ResponseEntity<Ticket>bookTicket(@RequestBody Passenger passenger) {
		Ticket ticket = new Ticket();
		
		ticket.setPassengerName(passenger.getPassengerName());
		ticket.setFromStation(passenger.getFromStation());
		ticket.setToStation(passenger.getToStation());
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTrainNo(passenger.getTrainNo());
		
		String status = new Random().nextBoolean()?"CONFIRMED":"WAITING";
		ticket.setTicketStatus(status);
		
		LocalDateTime dateTimeObj = LocalDateTime.now();
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
	    String dateTime = formatter.format(dateTimeObj);
		ticket.setDateOfBooking(dateTime);
		
		
		ticket.setTicketFare(2448.04f);
		
		UUID uuid = UUID.randomUUID();
	    String randomText = uuid.toString();
	    randomText = randomText.replace("-", "");
	    String pnr = randomText.substring(0,7).toUpperCase();
	    ticket.setPNR(pnr);
		
		
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}

}
