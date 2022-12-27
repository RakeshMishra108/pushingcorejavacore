package ObjectClassExample;

public class FinalizeExample {

	public static void main(String[] args) {
		for(int a=1;a<=5;a++) {
			new Game();
		}
		System.gc();//Requesting GC 
	}

}
