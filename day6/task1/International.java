package day6.task1;

import App.FlightApp;

public class International extends FlightApp{
   private double finalCost;
   
	public double getFinalCost() {
	return finalCost;
}

public void setFinalCost(double finalCost) {
	this.finalCost = finalCost;
}

	@Override
	public double calculateCost() {
		finalCost *= 1.5;
		return finalCost;
		
	}
	

}
