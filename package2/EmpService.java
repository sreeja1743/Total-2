package package2;
import package1.*;

public class EmpService extends Employee implements EmployeeService {
    
	@Override
	public void insuranceScheme() {
		if(getSalary() < 20000)
			setInsuranceScheme("Type1");
		else if(getSalary() > 20000 && getSalary() < 50000)
			setInsuranceScheme("Type2");
		else
			setInsuranceScheme("Type3");
	}

	 
	
	
	
	
}
