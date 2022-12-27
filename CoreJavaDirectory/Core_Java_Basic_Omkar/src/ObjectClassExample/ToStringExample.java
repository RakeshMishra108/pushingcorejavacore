package ObjectClassExample;

public class ToStringExample {//method of Object Class

	public static void main(String[] args) {
		int x = 100;
		System.out.println(x);
		Game g1 = new Game();
		//System.out.println(g1.getInfo());
		System.out.println(g1);//implicit call//outputs the address of respective object using the method tostring() method from Object Class
		String gameInfo = g1.toString();//tostring() method is also called as Callback method because it is called implicitly(automatically)
		System.out.println(gameInfo);//explicit call
		
	}

}
