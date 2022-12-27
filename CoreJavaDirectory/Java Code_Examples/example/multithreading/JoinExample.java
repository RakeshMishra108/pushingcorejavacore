package example.multithreading;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new MessageThread("Hello", 1000);
		Thread t2 = new MessageThread("Hi", 500);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thank you very much");

	}

}
