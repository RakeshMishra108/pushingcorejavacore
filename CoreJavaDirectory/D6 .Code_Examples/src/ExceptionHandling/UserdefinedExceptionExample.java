package ExceptionHandling;

public class UserdefinedExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int position = NameCollection.getPosition("Deepik");
			System.out.println("Position is : "+position);
		} catch (NameNotFoundException e) {
			// TODO: handle exception
			String message = e.getMessage();
			System.out.println(message);
		}
	}

}
