package regexdemo;

import java.util.Scanner;

import oracle.net.aso.s;

public class MainClass {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MainClass obj = new MainClass();
		while(true) {
			System.out.println("1)To validate [A_Z][1-4]-[6 character long numeric value]");
			System.out.println("2) To validate [A-z] 3 characters followed by 4 digits number");
			System.out.println("3) Exit");
			switch(sc.nextInt()) {
			case 1: System.out.println("Enter the string:");
			        obj.validate(sc.next());
			        break;
			case 2: System.out.println("Enter the string:");
			        obj.regexVal(sc.next());
			        break;
			case 3: System.exit(0);
			}
		}
	}
    
    public void validate(String string) {
    	display(new Validate(string).validateString(), string);
    }
    
    public void display(boolean flag, String string) {
    	if(flag) {
    		System.out.println(string+" is valid");
    	}
    	else
    		System.out.println(string+" is not valid");
    }
    
    public void regexVal(String string) {
    	display(new Regex1(string).validateString(), string);
    }
    
}
