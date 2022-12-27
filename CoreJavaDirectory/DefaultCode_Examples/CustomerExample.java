
public class CustomerExample {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.setCustomerId("C001");
		c1.setCustomerName("James");
		c1.setCustomerAge(37);
		
		System.out.println("Hello " + c1.getCustomerName());
		System.out.println("Your age is " + c1.getCustomerAge());
		
		c1.setCustomerName("James Gosling");
		System.out.println("Hello, your changed name is " + c1.getCustomerName());
	}

}
