package example.multithreading.sync.example.exception_handling;

public class NameNotFoundException extends Exception {
	private String invalidName;
	public NameNotFoundException(String errorMessage, String invalidName) {
		super(errorMessage);
		this.invalidName = invalidName;		
	}	
	//Overriding the method: getMessage()
	@Override
	public String getMessage() {
		//Invoke base class getMessage()
		String message = super.getMessage();
		String finalMessage = message + " ==> " + invalidName;
		return finalMessage;
	}
}
