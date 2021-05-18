package day7.task1;

public class Employee {
     public void checkPincode(String pin) throws EmployeeService{
    	 /*011 : Delhi 
		 *       022 : Mumbai 
		 *       080 : Banglore
		 *       020 : Pune*/
    	 if(pin.equals("011") || pin.equals("022") || pin.equals("080") || pin.equals("020")) {
    		 String s = " ";
    		 if(pin.equals("011"))
    			 s = "Delhi";
    		 else if(pin.equals("022"))
    			 s = "Mumbai";
    		 else if(pin.equals("080"))
    			 s = "Banglore";
    		 else if(pin.equals("020"))
    			 s = "Pune";
    		 System.out.println(pin+": "+s);
    	 }
    	 else {
    		 throw new EmployeeService("cannot find the pincode "+pin);
    	 }
    	 
     }
}
