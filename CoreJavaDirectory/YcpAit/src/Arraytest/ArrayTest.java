package Arraytest;


public class ArrayTest {

	public static void main(String[] args) {
//		Account accArray[]=new Account [5];
		System.out.println("Being main ...");
		Account accobj=new Account(101,"Omkar",5000);
		System.out.println("accobj: "+accobj);
		accobj.withdraw(400);
		System.out.println("accobj: "+accobj);
		System.out.println("End main");
	}

}
class Account{
	private int accountNumber;
	private String accountHolderName ;
	private float accountBalance;
	public Account(int accountNumber, String accountHolderName, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public void withdraw(int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}

/*       First.java
         main()
         
          1. function without argument and without return type
          2. function with argument and without return type
          3. function with argument and with return type
          4. function without argument but with return value
       
                  
                 




*/