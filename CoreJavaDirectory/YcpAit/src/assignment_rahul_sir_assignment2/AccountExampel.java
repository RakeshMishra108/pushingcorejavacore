package assignment_rahul_sir_assignment2;

public class AccountExampel {

	//Main Class
	public static void main(String[] args) {
		
		// Object of main class
		Account A1= new Account(1001,"Rakesh",50000);
		Account A2= new Account(1002,"Sampada",20000);
		//A1.transferFunds(A2,1000);
		A1.deposit(100000);
		
		// Calling methodS
		 System.out.println(" StartingBalance  "+A1.getBalance()+"  User Name "+A1.getName()+"\n Acc. no. :"+A1.getAccountno());
		 System.out.println(" StartingBalance  "+A2.getBalance()+"  User Name "+A2.getName()+"\n Acc. no. :"+A2.getAccountno());
	
		 A1.transferFunds(A2,10000);
		 System.out.println(" CurrentBalance  "+A1.getBalance()+"  User Name "+A1.getName()+"\n Acc. no. :"+A1.getAccountno());
		 System.out.println(" CurrentBalance  "+A2.getBalance()+"  User Name "+A2.getName()+"\n Acc. no. :"+A2.getAccountno());
	}

}
