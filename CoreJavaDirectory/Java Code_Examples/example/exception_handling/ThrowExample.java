package example.exception_handling;

public class ThrowExample {
	
	private static int divide(int x, int y) {
		if(y == 0) {
			//Throw the exception RuntimeException
			RuntimeException rx = 
					new RuntimeException("Cannot perform the division because the divisor is 0");
			throw rx;
		}
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int division = divide(10, 0);
			System.out.println(division);
		}
		catch(RuntimeException rnx) {
			//String errorMessage = rnx.getMessage();
			//System.out.println("Error message ==> " + errorMessage);
			rnx.printStackTrace();
		}
		

	}

}
