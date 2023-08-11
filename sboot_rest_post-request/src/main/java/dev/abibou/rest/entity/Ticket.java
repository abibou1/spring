package dev.abibou.rest.entity;

import lombok.Data;

@Data
public class Ticket {
	private String PNR;
	private String passengerName;
	private String fromStation;
	private String toStation;
	private String dateOfJourney;
	private Integer trainNo;  
	private String ticketStatus;
	private String dateOfBooking;
	private Float ticketFare;

}
