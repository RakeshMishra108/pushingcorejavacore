package example.inner_classes;

public class Outer {
	
	private int x = 10;//This is an instance variable
	private static int y = 20;//This is a class variable
	
	public void print() {
		System.out.println("Outer:print()");
		class Message {//This is a local class
			String getMessage(String name) {
				return "Welcome " + name;
			}
		}
		Message msg = new Message();
		System.out.println(msg.getMessage("James"));
	}
	
	public static class StaticInner {//This is a Static Inner class
			public void print() {
				System.out.println("StaticInner:print()");
				//System.out.println(x); Cannot access 'x' because it is non-static
				System.out.println(y);
			}
	}
	public class Nested {//This is a nested class (Non-static inner class)
		public void print() {
			//Can access both static as well as non-static fields
			System.out.println("Nested:print()");
			System.out.println(x); 
			System.out.println(y);
		}
	}
	
	

}
