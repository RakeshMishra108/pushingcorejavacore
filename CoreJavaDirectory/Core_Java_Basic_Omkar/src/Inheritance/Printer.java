package Inheritance;

public class Printer {
	private String content;
	public Printer() {
		content = "Good Morning";
	}
	public Printer(String content) {
		super();
		this.content = content;
	}
	public void print() {
		System.out.println("Printing the content : "+content+" in black and white");
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
