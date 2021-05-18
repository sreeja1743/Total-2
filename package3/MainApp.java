package package3;
import package1.*;
import java.util.*;
import package2.*;

public class MainApp {
	
    public static void main(String args[]) {
    	Employee e = new Employee();
    	EmpService emp = new EmpService();
    	
    	@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
    	while(true) {
    		System.out.println("Enter employee id:");
    		e.setId(s.nextInt());
    		System.out.println("Enter employee name:");
    		e.setName(s.next());
    		System.out.println("Enter employee's salary:");
    		e.setSalary(s.nextDouble());
    		System.out.println("Enter designation:");
    		e.setDesignation(s.next());   
           
            System.out.println("Employee details\n");
            System.out.println("employee's ID:"+e.getId());
            System.out.println("Name of the employee:"+e.getName());
            System.out.println("employee's salary:"+e.getSalary());
            System.out.println("employee's designation:"+e.getDesignation());
            System.out.println("employee's insurance type:"+e.getInsuranceScheme());
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
