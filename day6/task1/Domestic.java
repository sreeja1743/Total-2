package day6.task1;

import java.util.*;

import App.FlightApp;

public class Domestic extends FlightApp{
      private double finalCost;
      
        public Domestic() {
        	super
        }
	public double getFinalCost() {
		return finalCost;
	}

	public void setFinalCost(double finalCost) {
		this.finalCost = finalCost;
	}
	
    @Override
	public double calculateCost() {
		 finalCost *= 1.15;
		return finalCost;
	}
    
    public void listOfDomesticFlights() {
    List<String> list = new ArrayList<String>(); 
    list.add("indigo1");
    list.add("Emirates2");
    list.add("jfd");
    }

}
