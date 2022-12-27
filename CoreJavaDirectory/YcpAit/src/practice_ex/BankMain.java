package practice_ex;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		System.out.println("Enter 1 for Deposit ");
		System.out.println("Enter 2 for Widthrowal ");
		System.out.println("Enter 3 for CurrentBalance ");
		
		System.out.println("Enter your Choice : ");
		
		BankDetails b=new BankDetails();
		Deposit b1=new Deposit();
		Withdraw b2=new Withdraw();
		CurrentBalance b3=new CurrentBalance();
		
		Scanner Ch=new Scanner(System.in);
		int r4=Ch.nextInt();
       
	    switch(r4){
//	    case 1: b1.deposit(2000);
	    case 1: b1.deposit();
	    break;
	    
	    case 2: b2.withdraw(1000);
	    break;
	   
	    case 3: b3.currentBalance();
	    break;
	    
			
		}
	}

}
