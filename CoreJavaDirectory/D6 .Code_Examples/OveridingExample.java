
public class OveridingExample {

	public static void main(String[] args) {
		
		
		
		Printer bwPrinter = new Printer("Welcome");
		ColorPrinter cpPrinter = new ColorPrinter("Hello", "Blue");
		
		bwPrinter.print();
		cpPrinter.print();
		
		cpPrinter.doPrint();
		cpPrinter.doPrint(20);
		
		

	}

}
