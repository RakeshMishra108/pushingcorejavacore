package example.collections.generics;

public class GenericsExample {

	public static void main(String[] args) {
		Adder<String> strAdder = new StringAdder();
		Adder<Integer> intAdder = new IntegerAdder();
		
		String finalString = strAdder.doAdd("Hello", "Welcome");
		Integer finalInteger = intAdder.doAdd(10, 20);
		System.out.println("Final String: " + finalString);
		System.out.println("Final Integer: " + finalInteger);

	}

}
