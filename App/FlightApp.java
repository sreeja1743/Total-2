package App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public abstract class FlightApp {
	private String flightNumber;
	private String airliner;
	
    private int flag = 0;
	
	private String source;
	private LocalDateTime flyDateTime;
	
	private String destination;
	private LocalDateTime arrivalDateTime;
	
	private Hault[] hault; // can be null;
	
	private boolean flyType; // domestic (false) or international(true)
	private int internationFlyTax; 
	
	private double baseFare; // always include 5% as airport surcharge and 30% as fuel cost
	private double finalCost;// based on Airliner calendar and other criteria's 
	
	private AirlineCalendar calendar;
	FriendlyCountry  country = new FriendlyCountry();
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirliner() {
		return airliner;
	}

	public void setAirliner(String airliner) {
		this.airliner = airliner;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public LocalDateTime getFlyDateTime() {
		return flyDateTime;
	}

	public void setFlyDateTime(LocalDateTime flyDateTime) {
		this.flyDateTime = flyDateTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Hault[] getHault() {
		return hault;
	}

	public void setHault(Hault[] hault) {
		this.hault = hault;
	}

	public boolean isFlyType() {
		return flyType;
	}

	public void setFlyType(boolean flyType) {
		this.flyType = flyType;
	}

	public int getInternationFlyTax() {
		return internationFlyTax;
	}

	public void setInternationFlyTax(int internationFlyTax) {
		this.internationFlyTax = internationFlyTax;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(int baseFare) {
		this.baseFare = baseFare+0.35*baseFare;
		
	}

	public double getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(double finalCost) {
		this.finalCost = finalCost;
	}

	public AirlineCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(AirlineCalendar calendar) {
		this.calendar = calendar;
	}

	
	
	public double calculateCost()
	{
		/*
		 * Cost of the flight will be decided by 
		 * 1. arrival date. :-
		 * 		1.a)  If 10 to 2 days prior to the AirlinerCalendar Date	 :- 20% extra
		 * 		1.b)  If 1 to 0 day prior to the AirlinerCalendar Date 	:-  50% extra*/
		 
		 for(LocalDate x: calendar.listOfHolidays) {
			 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
				String holiday = formatter.format(x);
				long daysBetween = ChronoUnit.DAYS.between(arrivalDateTime.toLocalDate(), LocalDate.parse(holiday));
			 if(daysBetween <= 10 && daysBetween >= 2) {
				 finalCost *= 1.2;
				 break;
			 }
			 else if(daysBetween == 1 || daysBetween == 0) {
			   	 finalCost *= 1.5;
			     break;
			 }
		 }
		 
		 
		 
		/* * 2. arrival time.
		 * 		2.a) If flight land time is 2 hr +/- to 12:00 Noon (Any Date)	:- 10% extra*/
		 
		 LocalTime flight_time = arrivalDateTime.toLocalTime();

			LocalTime afternoon = LocalTime.parse("12:00");
			long h = ChronoUnit.HOURS.between(flight_time, afternoon);
				if(h <= 2 || h >= -2)
			 finalCost *= 1.1;
		 
		/* * 3. Non free travel countries (List of FriendlyCountry.java)
		 * 		3.a) If destination belongs to non free travel, friendly country :- 30% extra
		 * */
		for(String str:country.countries) {
			if(destination.equalsIgnoreCase(str)) {
				flag = 1;
				break;
		         }
		}
		if(flag == 0)
			finalCost *= 1.3;
		return finalCost;
	}
}
