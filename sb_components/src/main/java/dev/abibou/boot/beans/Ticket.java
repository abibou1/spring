package dev.abibou.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {
	@Value("pnrStringValue")
	private String pnr;
	
	@Value("${ticket.passenger.name}")
	private String passengerName;
	
	public Ticket() {
		System.out.println("Ticket :: constructor");
	}

	@Override
	public String toString() {
		return "Ticket [pnr=" + pnr + ", passengerName=" + passengerName + "]";
	}

}
