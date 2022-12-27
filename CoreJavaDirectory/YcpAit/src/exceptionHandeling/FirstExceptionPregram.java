package exceptionHandeling;

public class FirstExceptionPregram {


	public static void main(String[] args) {
		int a=12,b=0,c;
		try {
			c=a/b;
			System.out.println("Results : "+c);
		} 
		catch (Exception e) {
			//			e.printStackTrace();
			System.out.println("Do't use zero at denominator");
		}


	}

}
