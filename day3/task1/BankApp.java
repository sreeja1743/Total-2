package day3.task1;
import java.util.*;

public class BankApp {

public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	BankAccount obj = new BankAccount();
	
	while(true) {
		System.out.println("Enter the Account Holder's Name");
	    obj.setAccountHolderName(s.next());
		System.out.println("Set the balance");
		obj.setBalance(s.nextInt());
		if(!(obj.isStatus()))
			System.out.println("Warning! Minimum balance should be 10000. Until then account remains inactive"+"\n");
		System.out.println("Choose:");
		System.out.println("1)Deposit");
		System.out.println("2)WithDraw");
		System.out.println("3)Exit");
		switch(s.nextInt()){
		case 1: System.out.println("Enter the deposit amount:");
		        System.out.println("Succesfully deposited current balance is "+obj.doDeposit(s.nextInt())+"\n");
		        break;
		case 2: System.out.println("Enter withdrawal amount:");
		        int p = s.nextInt();
		        if(obj.isStatus()) {
		        	int amount = obj.doWithdrawal(p);
		        	if(obj.isStatus())
		        	System.out.println("Succesfully deducted and current amount is "+amount+"\n");
		            else {
		        	System.out.println("Cannot deduct the money as it is below the minimum balance");
		        	int bal = obj.getBalance()+p;
		        	System.out.println("Current Balance is "+bal+"\n");}}
		        break;
		case 3: System.exit(0);
		        
		        
		}
	}
	
		 
		
	}
}
