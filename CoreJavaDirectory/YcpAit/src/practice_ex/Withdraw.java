package practice_ex;

import java.util.Scanner;

public class Withdraw extends BankDetails {
	
	public void withdraw(int money){
		System.out.println("Enter the password : ");
		Scanner r1=new Scanner(System.in);
		int Password=r1.nextInt();
		
			 if (Password ==123) {
				int bal=getCbal()-money;
				System.out.println("Deposited balance : "+money);
				System.out.println("Current balance : "+bal);
			}
			else {
				System.out.println("Bsdk sahi Password dall");
			}
	}

	
}
