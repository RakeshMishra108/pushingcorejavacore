package example.lambda;

public class ProcessorExample {

	public static void main(String[] args) {
		Processor adder = (x, y) -> x + y;//'return' statement is not to be used because it is a single expression lambda
		Processor subtractor = (m, n) -> {
			int subtraction = m - n;
			return subtraction;//Here 'return' statement is to be used because it is a blocked lambda
		};
		Processor multiplier = (int p, int q) -> p * q;
		
		System.out.println(adder.process(10, 20));
		System.out.println(subtractor.process(50, 20));
		System.out.println(multiplier.process(5, 3));

	}

}
