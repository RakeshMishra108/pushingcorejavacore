package practice_exam;

public class Methods_Java {

	public static void main(String[] args) {
		rajeev();
		
		Methods_Java J=new Methods_Java();
		int t=J.sum(15,20);
		System.out.println("Non_Static method /return type int (45) : "+t);
		System.out.println("$$$$$$$$$$$$$$$$$$$");
		
		int k=shanta(10,15);
		System.out.println("Static method / return type int(35) : "+k);
		System.out.println("######################");
	}
	
	int sum(int a,int b) {
		
		return a+b;
	}
	
    static void rajeev() {
	int r=5;
	System.out.println("Static method calling/Void type of return(5) :"+r);
	System.out.println("**************************");
	}
    
    static int shanta(int q,int c) {
    	int z=q+c;
    	return z;
    }

}
