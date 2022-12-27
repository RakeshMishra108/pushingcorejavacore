package multiThreading;

public class ImplimentingRunnable implements Runnable {

	@Override
	public void run() {

		 try {
			 for (int i=1;i<=6;i++) {
				 System.out.println("Implemented class");
			Thread.sleep(500);
			 }
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
