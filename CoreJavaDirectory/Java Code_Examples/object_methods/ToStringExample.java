package object_methods;

public class ToStringExample {

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		
		Game g1 = new Game();
		//System.out.println(g1.getInfo());
		System.out.println(g1); //Here the call to toString() is implicit
		String gameInfo = g1.toString();//Here it is explicit
		System.out.println(gameInfo);

	}

}
