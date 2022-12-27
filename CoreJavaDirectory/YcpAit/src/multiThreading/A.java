package multiThreading;

public class A extends Thread {
	
	@Override
	public void run(){		
	        try {
	        	for(int i=1;i<=9;i++) {
	    	        System.out.println("Thread Implimentation ");
				Thread.sleep(1500);
	        	}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
