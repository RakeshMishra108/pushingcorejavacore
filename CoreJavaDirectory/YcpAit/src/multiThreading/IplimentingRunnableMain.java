package multiThreading;

public class IplimentingRunnableMain {

	public static void main(String[] args) {
		A r=new A();
		Thread t=new Thread(r);
		t.start();
		
		
			 try {
				
				 for (int i=1;i<=6;i++) {
					 System.out.println("class B");
					 Thread.sleep(1500);
					 }
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
