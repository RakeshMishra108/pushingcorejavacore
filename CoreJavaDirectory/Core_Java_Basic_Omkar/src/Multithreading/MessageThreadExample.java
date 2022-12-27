package Multithreading;

public class MessageThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MessageThread("Hello",1000);
		Thread t2 = new MessageThread("Hi",500);
		t1.start();
		t2.start();
	}

}
