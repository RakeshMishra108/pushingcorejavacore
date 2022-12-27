package Assignment2;
import java.util.Scanner;
public class AccountMain {

	public static void main(String[] args) {
		float deposit, withdraw, transfer;
		Account a1 = new Account(123,"Omkar",50000);
		Account a2 = new Account(456,"Man",25000);
		Scanner sc = new Scanner(System.in);
		System.out.println("Acc. Name : "+a1.getName()+" Acc. No. : "+a1.getAccountNo()+" Acc. Balance : "+a1.getBalance());
		System.out.println("Acc. Name : "+a2.getName()+" Acc. No. : "+a2.getAccountNo()+" Acc. Balance : "+a2.getBalance());
		System.out.println("Enter the ammount to be deposited : ");
		deposit = sc.nextFloat();
		a1.deposit(deposit);
		System.out.println("Acc. Name : "+a1.getName()+" Acc. No. : "+a1.getAccountNo()+" Acc. NewBalance : "+a1.getBalance());
		System.out.println("Enter the ammount to be withdraw : ");
		withdraw = sc.nextFloat();
		a2.withdraw(withdraw);
		System.out.println("Acc. Name : "+a2.getName()+" Acc. No. : "+a2.getAccountNo()+" Acc. NewBalance : "+a2.getBalance());
		System.out.println("Enter the ammount to Transfer from "+a1.getAccountNo()+" to "+a2.getAccountNo()+"  : ");
		transfer = sc.nextFloat();
		a1.transferFunds(a2,a1,transfer);
		sc.close();
		System.out.println("New balance of Acc. No. "+a2.getAccountNo()+" : "+a2.getBalance());
		System.out.println("New balance of Acc. No. "+a1.getAccountNo()+" : "+a1.getBalance());
		
	}

}
