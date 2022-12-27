package practice_ex;

public class student{
	static int a=2;
	int b=3;
	int c;
	
	public static void B() {
		System.out.println(a);
	}
	
	static {
		System.out.println("Static mathod without object");
	}
		
	public void C(){
		c=a+b;
		System.out.println("Calculation in C class : "+ c);
	} 
	
	public static void main (String args[]) {
		student s1=new student();
		s1.C();
		student.B();
	}
}


