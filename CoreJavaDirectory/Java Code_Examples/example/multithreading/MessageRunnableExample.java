package example.multithreading;

public class MessageRunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new MessageRunnable("Good Morning", 2000);
		Runnable r2 = new MessageRunnable("Good Night", 1500);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t2.setPriority(2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.start();
		t2.start();

	}

}
