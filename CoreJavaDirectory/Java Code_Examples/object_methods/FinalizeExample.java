package object_methods;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int a=1;a<=5;a++) {
			new Game();
		}
		System.gc(); //Requesting GC to run
	}

}
