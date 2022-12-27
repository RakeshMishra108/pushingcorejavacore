package Multithreading;

public class MessageThread extends Thread {
	private String message;
	private int delayTime;
	
	
	public MessageThread(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}


	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println(message);
			//introducing a time gap based upon delayTime:milliseconds
			
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
