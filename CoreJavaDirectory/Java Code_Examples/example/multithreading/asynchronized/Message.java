package example.multithreading.asynchronized;

public class Message {
	private String content;
	
	public Message(String content) {
		this.content = content;
	}
	
	public void printMessage() throws InterruptedException {
		//Printing the contents using some decoration with some time gap
		System.out.println("*******************");
		Thread.sleep(1000);
		System.out.println(content);
		Thread.sleep(1000);
		System.out.println("*******************");
		Thread.sleep(1000);
	}

}
