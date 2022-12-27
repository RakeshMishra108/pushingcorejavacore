
public class ColorPrinter extends Printer {
	private String color;

	public ColorPrinter() {
		color = "Red";
	}

	public ColorPrinter(String content, String color) {
		super(content);
		this.color = color;
	}
	public void print() {
		String content = getContent();//this.getContent();
		System.out.println("Printing the content: " + content + " in " + color + " color");
	}
	
	public void doPrint(int lines) {
		System.out.println("ColorPrinter: doPrint()" + lines);
	}
	@Override
	public void startPrint() {
		
	}
	
	
}
