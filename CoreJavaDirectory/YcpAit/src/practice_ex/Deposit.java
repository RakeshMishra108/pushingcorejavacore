package practice_ex;

import java.util.Scanner;

public class Deposit extends BankDetails {
 
//	public void deposit(int money)
	public void deposit()
	{
		System.out.println("Enter the pasward : ");
		Scanner r=new Scanner(System.in);
		int Password=r.nextInt();
		
		if (Password ==123) {
			System.out.println("Enter theamount to deposit : ");
			Scanner r4=new Scanner(System.in);
			int money=r4.nextInt();
			
			int bal=getCbal()+money;
//			 bal=bal+money;
			System.out.println("Deposited balance : "+money);
			System.out.println("Current balance : "+bal);
		}
		else {
			System.out.println("Bsdk sahi Password dall");
		}
	}
	
}
