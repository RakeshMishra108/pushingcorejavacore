package example.lambda;

public class PrintableExample {

	public static void main(String[] args) {
		Printable p1 = () -> System.out.println("Good Morning"); //Single expression lambda
		p1.print();
		
		Printable p2 = () -> { //Blocked Lambda
			System.out.println("Good Afternoon");
			System.out.println("Good Night");
		};
		p2.print();

	}

}
