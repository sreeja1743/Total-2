package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import App.*;

public class FlightList {
    
	public static void main(String[] args) {
		FlightList obj = new FlightList();
		obj.listDemoForFlight();
	}
	
	public void listDemoForFlight(){
		
		List<FlightApp> flight = new ArrayList<>();
		flight.add(new FlightApp());
		flight.add(new Hault());
		flight.add(new FlightApp());
		Iterator<FlightApp> itr = flight.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	
	}
	
	
	
	
	

	
	
	}
