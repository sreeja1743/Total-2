package day7.task1;

public class CustomException {
   
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();

		Employee emp = new Employee();
		try {
			String pincodes[] = service.getEmployeePinCode();
			for(int i = 0; i < pincodes.length; i++) {
				emp.checkPincode(pincodes[i]);
			}
			
		}
        catch(Exception e) {
        	System.out.println(e);
        }
	}
   
}
