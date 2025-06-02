package ca.sheridancollege.siddiq73.beans;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tickets {
	private String fname;
	private String lname;
	private String email;
	private String langPreference;
	private double price;
	private boolean firstTime;
	private LocalDate date;
	private LocalTime time;
	private String ticket;
	
	private String[] tickets = {"General Admission", "Reserved Seating", "Premium/VIP"};
	private String[] lang = {"English", "Farsi"};
}