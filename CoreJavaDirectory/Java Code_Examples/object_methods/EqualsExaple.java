package object_methods;
public class EqualsExaple {

	public static void main(String[] args) {
		Game game1 = new Game("Squash", "Indoor", 2);
		Game game2 = new Game("Squash", "Indoor", 2);
		Game game3 = game2;
		
		int a = 10;
		int b = 10;
		System.out.println(a == b);
		System.out.println("Using == " + (game1 == game2));
		System.out.println("Using equals()  ----> " + game1.equals(game2));

	}

}
