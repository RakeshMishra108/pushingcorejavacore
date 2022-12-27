
public class Customer {//Class names are TitleCased
	private String customerId;//Field names are camelCased
	private String customerName;
	private int customerAge;
	public String getCustomerId() {//Method names are also camelCased
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	public void print() {
		//Code to print Customer's data
	}
	
	public void print(int x) {
		//Code to print Customer's data
	}
	
	public void print(int x, int y) {
		//Code to print Customer's data
	}
	//c1.print(20,2,6);
	
	
	
}
