/*package App;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TravelApp {
	public static void main(String[] args) {
		 //Write code to call Flight constructor and Flight class setter methods
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		FlightApp f = new FlightApp();
		FlightDetails flightDetails = new FlightDetails();
		
		AirlineCalendar a = new AirlineCalendar();
		while(true) {
			System.out.println("Choose:");
			System.out.println("1)To book a flight");
			System.out.println("2)Exit");
		switch(s.nextInt()) {
		case 1:
		        System.out.println("choose:");
		        System.out.println("1)Domestic");
		        System.out.println("2)International");
		        int num = s.nextInt();
		        if(num == 1)
		        	f.setFlyType(false);
		        else
		        	f.setFlyType(true);
		        System.out.println("Enter flight name:");
		        f.setAirliner(s.next());
		        System.out.println("Enter source:");
		        f.setSource(s.next());
		        System.out.println("Enter Destination:");
		        f.setDestination(s.next());
		        //System.out.println("Enter the date and time of travel:");
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
				LocalDateTime arr = LocalDateTime.parse("2021-03-26 11:30", formatter);
		        f.setFlyDateTime(arr);
		        System.out.println("Enter the flight number:");
		        f.setFlightNumber(s.next());
		        System.out.println("Enter base fare:");
		        f.setBaseFare(s.nextInt());
		       // System.out.println("Enter arrival date and time"); 
		        LocalDateTime ar = LocalDateTime.parse("2021-03-26 02:30", formatter);
		        f.setArrivalDateTime(ar);
		        f.setCalendar(a);
		        flightDetails.printFlightDetails(f);
		        break;
		        
		case 2: System.exit(0);
		}
		}
		
		
	}}*/

