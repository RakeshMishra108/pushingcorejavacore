package multiThreading;

public class B  {

	public static void main(String[] args) {
		A t=new A();
		t.start();
		
        try {
        	for(int i=1;i<=9;i++) {
        		System.out.println("Main Methos ..");
			Thread.sleep(1500);
		  } 
        }
        	catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
