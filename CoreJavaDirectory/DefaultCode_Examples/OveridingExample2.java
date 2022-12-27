
public class OveridingExample2 {

	public static void main(String[] args) {
		Printer p = new ColorPrinter();
		p.startPrint();
		//p.printSomething();
		ColorPrinter cp = (ColorPrinter)p;//Here 'p' of type Printer is getting cast to of type ColorPrinter and gets stored inside 'cp'
	//	cp.printSomething();
		
		Printer prn = new ColorPrinter("Hello Everyone!!", "Green");
	//.out.println(prn.getInfo());
		

	}

}
