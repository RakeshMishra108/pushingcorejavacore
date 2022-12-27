package daily_practice;

public class ExceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int n1, n2, result;
  
  try {
	  n1=Integer.parseInt(args[0]);
	  n2=Integer.parseInt(args[1]);
	  result=n1+n2;
	  System.out.println(result);  
  }
  catch(ArrayIndexOutOfBoundsException ex) {
	  System.out.println("Enter Two Values");
  }
 
  
	}

}
