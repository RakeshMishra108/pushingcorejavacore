class A {
	
}
class B extends A {
	
}
class C extends A {
	
}
public class OveridingExample {

	public static void main(String[] args) {
		
		A a1 = new B();
		A a2 = new C();
		//B b1 = new C();
		
		Printer bwPrinter = new Printer("Welcome");
		ColorPrinter cpPrinter = new ColorPrinter("Hello", "Blue");
		
		bwPrinter.print();
		cpPrinter.print();
		
		cpPrinter.doPrint();
		cpPrinter.doPrint(20);
		
		

	}

}
