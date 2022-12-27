package ExceptionHandling;

public class ThrowExample {
	private static int divide(int x,int y) {
		if(y==0) {
			RuntimeException ex = new RuntimeException("Cannot perform the division because the divisor is 0");
			throw ex;
		}
		return x/y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int division = divide(10,0);
			System.out.println(division);
		}
		catch(RuntimeException ex) {
			String errorMessage = ex.getMessage();
			System.out.println("Error Message ==> "+errorMessage);
			ex.printStackTrace();
		}
	}

}
