package assignment_rahul_sir_assignment2;

//Class
public class Account {
	
	//Variable
	private int accountno;
	private String name;
	private float balance;

	// Method 1
	public void deposit(float amount) {
		this.balance=balance +amount;	
		
	}
	
	//Method 2 
	public void withdraw(float amount) {
		this.balance=balance-amount;
		
	}
	
	// Method 3
	public void transferFunds(Account toAccount,float amounttoTransfer) {
		
		toAccount.balance=toAccount.balance+amounttoTransfer;
		this.balance=this.balance-amounttoTransfer;
		
//		int sendingBalance = (senderBalance-amount);
//		int RecevingBalance = (receverBalance-amount);
	
    }

	//Constructor
	public Account(int accountno, String name, float balance) {
		
		this.accountno = accountno;
		this.name = name;
		this.balance = balance;
	}

	public Account() {
		
	}

	// Getter and Setter
	public int getAccountno() {
		return accountno;
	}

	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}


}
