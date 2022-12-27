package example.multithreading.asynchronized;

public class AsynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message("Happy Diwali 2022");
		Thread t1 = new MessageThread(msg);
		Thread t2 = new MessageThread(msg);
		t1.start();
		t2.start();

	}

}
