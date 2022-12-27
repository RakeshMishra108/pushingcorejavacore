package ExceptionHandling;

public class SimpleExceptionExample {

	public static void main(String[] args) {
		int n1,n2,result;
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			//result = n1 + n2;
			result = n1 / n2;
			System.out.println(result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {//'ex' is object of ArrayIndexOutOfBoundsException class
			System.out.println("Enter atleast two no.!!");
		}
		catch(ArithmeticException ex) {
			System.out.println("Enter 2nd number as non-zero");
		}
		catch(Exception ex) {//default exception handling
			System.out.println("General Error");
		}
		finally {
				System.out.println("Thank you..............");
		}
	}

}
