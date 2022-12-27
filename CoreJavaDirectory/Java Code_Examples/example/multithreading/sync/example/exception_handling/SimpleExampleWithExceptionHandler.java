package example.multithreading.sync.example.exception_handling;

public class SimpleExampleWithExceptionHandler {

	public static void main(String[] args) {//"10" and "20"
		// TODO Auto-generated method stub
		int n1, n2, result;
		try {
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
			//result = n1 + n2;
			result = n1 / n2;
			System.out.println(result);
		}
		
		/*catch(ArithmeticException ex) {
			System.out.println("Enter 2nd number as non-zero");
		}
		catch(ArrayIndexOutOfBoundsException ex) {//Is called as an Exception Handler
			System.out.println("Enter at least 2 numbers");
		}*/
		//Handling Arithmetic and ArrayIndex using a single 'catch' block - A Java 1.7 feature
		catch(ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			if(ex instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Enter at least 2 numbers");
			else
				System.out.println("Enter 2nd number as non-zero");
		}
		catch(RuntimeException ex) {
			System.out.println("RuntimeException fired");
		}		
		catch(Exception ex) {
			System.out.println("General Error");
		}
		catch(Throwable t) {
			System.out.println("Throwable fired");
		}
		System.out.println("Thank you...");
		/*
		 * finally { System.out.println("Thank you..."); }
		 */
		
	}

}
