
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
		
		Customer c2 = c1;
		System.out.println("Name using C2: " + c2.getCustomerName());
		c2.setCustomerName("Gavin King");
		System.out.println("Name using C1: " + c1.getCustomerName());
		c2 = new Customer();
		c2.setCustomerName("Dennis Richie");
		System.out.println(c2.getCustomerName());
		System.out.println(c1.getCustomerName());
	}

}
