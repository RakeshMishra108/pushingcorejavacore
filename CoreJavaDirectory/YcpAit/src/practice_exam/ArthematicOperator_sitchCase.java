package practice_exam;

public class ArthematicOperator_sitchCase {

	public static void main(String[] args) {
		int a=2,b=23,c=3;
		
		switch(c) {
		
		case 1:c=a+b;
		System.out.println("Addition "+c);
		break;
		
		case 2:c=a*b;
		System.out.println("Multiplication "+c);
		break;
		
		case 3:c=a/b;
		System.out.println("Division "+c);
		break;
		
		default:
			System.out.println("Enter a Valid operation");
			
		}

	}

}
