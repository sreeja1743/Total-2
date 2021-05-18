package App;

public class FlightDetails {
	
	public void printFlightDetails(FlightApp flight)
	{
		/* Write code to print the flight information and fare break up*/
		  System.out.println(" Your flight info");
		  System.out.println("Airline: "+flight.getAirliner());
		  System.out.println("Flight Number: "+flight.getFlightNumber());
		  System.out.println("Destination: "+flight.getDestination());
		  System.out.println("Arrival date and time: "+flight.getArrivalDateTime());
	      System.out.println("Total cost of the flight: "+flight.calculateCost());
	      System.out.println("Base fare of the flight: "+flight.getBaseFare());
	      System.out.println("International tax: "+flight.getInternationFlyTax());
	}
}
