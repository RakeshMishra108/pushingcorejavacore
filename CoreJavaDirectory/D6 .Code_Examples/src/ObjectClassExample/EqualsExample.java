package ObjectClassExample;

public class EqualsExample {//equals(Object)

	public static void main(String[] args) {
		Game game1 = new Game("Squash","Indoor",2);
		Game game2 = new Game("Squash","Indoor",2);
		Game game3 = game2;
		
		int a = 10;
		int b = 10;
		
		System.out.println(a==b);
		System.out.println("Using == --> "+(game1 == game2));
		System.out.println("Using == --> "+(game3 == game2));
		//when 2 references are compared using "==" it is checked whether they share memory or not.
		//if so, outcome is 'true' else 'false'
		//after adding equals() and hashcode() method
		System.out.println("Using equals() --> "+game1.equals(game2));
		//equals() from object class behaves same as that of '=='
		//hence to test the object of equality based upon their contents, it is to be overridden in the subclass.
	}

}
