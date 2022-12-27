package example.multithreading;

public class MessageThread extends Thread {
	private String message;
	private int delayTime;
	
	public MessageThread(String message, int delayTime) {
		this.message = message;
		this.delayTime = delayTime;
	}

	public void run() {
		for(int a=1;a<=10;a++) {
			System.out.println(message);
			//Introducing a time gap based upon delayTime : milliseconds
			try {
				Thread.sleep(delayTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
