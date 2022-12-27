package Inheritance;

public class OveridingMain {//runtime polymorphism

	public static void main(String[] args) {
		Printer bwPrinter = new Printer("Welcome");
		ColourPrinter cpPrinter = new ColourPrinter("hello","Blue");
		
		Printer p = new ColourPrinter();
		p.print();
		//p.toprint(); throws error because obj 'p'static type Printer can't fetch toprint() method of ColourPrinter
		//If an object of subclass is created using a reference of super class type then it is possible to call the methods using that reference only if those methods are defined in the superclass
		//by anychance if the method is not present in the superclass and it is be invoked,then an explicit cast is required
		//Casting-->
		ColourPrinter cp = (ColourPrinter)p;//here 'p' of type Printer is getting cast to of type ColourPrinter
		cp.toprint();
		bwPrinter.print();//overriding methods should have same signature
		cpPrinter.print();//else they are considered overloading methods
		
		

	}

}
