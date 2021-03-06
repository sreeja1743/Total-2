package day7.task1;

public class EmployeeService extends Exception {
	

		private String employees[] = {"101001011","102001022","103002011","104003080","105002020","106002080","107004930"};
		/*
		 * Note : employee codes are designed in following way: 
		 * a) first 3 digits are employee code
		 * b) next 3 digits are related to their department id.
		 * c) and last 3 digits are the city code of their work location 
		 *     for example 
		 *       011 : Delhi 
		 *       022 : Mumbai 
		 *       080 : Banglore
		 *       020 : Pune
		 * */
		String message = "";
		
		public EmployeeService() {
			super();
			
		}
		
		public String[] getEmployeeCodes()
		{
			String codes[] = new String[employees.length];
			int count = -1;
			for (String empid : employees) {
				codes[++count] = empid.substring(0, 3);
			}
			
			return codes;
		
		}
		public String[] getEmployeePinCode() {
			String pincodes[] = new String[employees.length];
			int count = -1;
			for(String empcode : employees) {
				pincodes[++count] = empcode.substring(6,9);
				
				
			}
			return pincodes;
		}
		
		public EmployeeService(String message) {
			super(message);
			this.message = message;
		}

		@Override
		public String toString() {
			return "pincode exception "+message;
		}

}
