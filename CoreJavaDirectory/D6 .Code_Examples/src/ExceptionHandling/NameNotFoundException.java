package ExceptionHandling;

public class NameNotFoundException extends Exception {//Checked exception
	private String invalidName;

	public NameNotFoundException(String errorMessage, String invalidName) {
		super(errorMessage);
		this.invalidName = invalidName;
	}
	//overriding the method getMessage()
	@Override
	public String getMessage() {
		//Invoke base class getMessage
		String message = super.getMessage();
		String finalMessage = message +" ==> "+invalidName;
		return finalMessage;
	}

}
