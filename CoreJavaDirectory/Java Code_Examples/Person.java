
public class Person {
	static {
		System.out.println("Person class loaded");
	}
	private String name;
	private int age;
	String email;//Instance variable - Must be accessed using some object
	static private int personCount;//Class variable - Can be accessed without object (Recommended) or even with object
	public static int getPersonCount() {
		System.out.println("Count => " + personCount);
		//System.out.println(this);
		return personCount;
	}
	public Person() {
		name = "James";
		age =72;
		email = "james@oracle.com";
		personCount++;
	}
	public Person(String name, int age, String email) {
		this.name = name;
		this.age = age;
		this.email = email;
		personCount++;
	}
	public Person(int age, String name, String email) {
		this.age = age;
		this.name = name;
		this.email = email;
		personCount++;
	}
	public void printInfo() {
		System.out.println(name);//Can access non-static
		System.out.println(personCount);//Can access static as well
		System.out.println(this);
	}
	//Getters and Setters

}
