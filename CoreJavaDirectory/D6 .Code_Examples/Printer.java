
public class Printer {
		private String content;
		
	public Printer() {
		content = "Good morning";
	}
	
	public Printer(String content) {
		this.content = content;
	}

	public void print() {
		System.out.println("Printing the content: " + content + " in black and white");
	}

	public String getContent() {
		return content;
	}
	
	public void doPrint() {
		System.out.println("Printer: doPrint()");
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void startPrint() {
		
	}
	
	public String getInfo() {
		String info = content;
		return info;
	}
}
