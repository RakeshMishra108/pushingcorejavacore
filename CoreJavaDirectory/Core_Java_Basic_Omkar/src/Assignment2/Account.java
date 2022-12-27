package Assignment2;
import java.util.Scanner;
public class Account {
	private int accountNo;
	private String Name;
	private float balance;
	Scanner sc = new Scanner(System.in);
	//Constructor
	public Account() {
		super();
		this.accountNo = 00000;
		Name = "noname";
		this.balance = 000000;
	}
	public Account(int accountNo, String name, float balance) {
		super();
		this.accountNo = accountNo;
		Name = name;
		this.balance = balance;
	}
	//getter and setter methods
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public String getName() {
		return Name;
	}
	
	public float getBalance() {
		return balance;
	}
	//other methods
	public void deposit(float deposit) {
		this.balance = balance + deposit; 
	}
	
	public void withdraw(float withdraw) {
		this.balance = balance - withdraw; 
	}
	public void transferFunds(Account toAccount,Account fromAccount,float amountToTransfer) {
		toAccount.deposit(amountToTransfer);
		fromAccount.withdraw(amountToTransfer);
	}
}
