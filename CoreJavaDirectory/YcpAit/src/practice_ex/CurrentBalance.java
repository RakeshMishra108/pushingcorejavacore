package practice_ex;

import java.util.Scanner;

public class CurrentBalance extends BankDetails {
 public void  currentBalance() {
	 System.out.println("Enetr the password : ");
     Scanner r3=new Scanner(System.in);
     int X=r3.nextInt();
     
     if(X==123) {
    	 System.out.println("current balance : "+getCbal());   	 
     }
     else {
			System.out.println("Bsdk sahi Password dall");
		}
 }
}
