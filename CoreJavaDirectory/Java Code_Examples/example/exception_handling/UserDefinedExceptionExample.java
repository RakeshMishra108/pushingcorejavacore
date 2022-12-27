package example.exception_handling;

public class UserDefinedExceptionExample {

	public static void main(String[] args) {
		try {
			int position = NameCollection.getPosition("Tapsi");
			System.out.println("Position is " + position);
		} catch (NameNotFoundException e) {
			// TODO Auto-generated catch block
			String message = e.getMessage();
			System.out.println(message);
			//e.printStackTrace();
		}

	}

}
