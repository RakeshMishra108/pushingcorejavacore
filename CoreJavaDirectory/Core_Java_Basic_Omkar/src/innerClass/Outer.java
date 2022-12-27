package innerClass;

public class Outer {

	private int x = 10; //instance variable
	private static int y = 20;//class variable
	
	public static class StaticInner {//this is a Static Inner class
		public void print() {
			System.out.print("Static class : ");
			System.out.println(y);
		}
	}
	public class Nested {//nested class non-static inner class
		public void print() {
			System.out.print("Nested class : ");
			System.out.println(x);
			System.out.println(y);
		}
	}
	public void print() {
		System.out.print("Outer : ");
		class Message{
			String getMessage(String name) {
				return "Welcome"+name;
			}
		}
		Message msg = new Message();
		System.out.println(msg.getMessage("James"));
	}
	
}
