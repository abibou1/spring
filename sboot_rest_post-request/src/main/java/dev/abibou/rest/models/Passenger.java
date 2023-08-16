package dev.abibou.rest.models;

import lombok.Data;

@Data
public class Passenger {
	private String passengerName;
	private String fromStation;
	private String toStation;
	private String dateOfJourney;
	private Integer trainNo;
}
