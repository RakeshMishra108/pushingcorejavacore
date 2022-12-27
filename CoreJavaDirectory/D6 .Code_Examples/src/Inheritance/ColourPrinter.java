package Inheritance;

public class ColourPrinter extends Printer {
	private String color;

	public ColourPrinter() {
		color = "Red";
	}

	public ColourPrinter(String content, String color) {
		super(content);
		this.color = color;
	}
	public void print() {
		String content = getContent();//this.getcontent()
		System.out.println("Printing the content : "+content+" in "+color+" color");
	}
	public void toprint() {
		String content = getContent();//this.getcontent()
		System.out.println("Printing the content : "+content+" in "+color+" color");
	}
}
