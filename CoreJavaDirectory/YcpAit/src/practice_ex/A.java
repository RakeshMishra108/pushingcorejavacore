package practice_ex;

public class A {
   int b=13;String d;
   
	public int  A(int a) {
		System.out.println("A class : "+a);
		return a;
	}
	
	public String c() {
		d="School";
		System.out.println("An parent class :"+d);
		return d;
	}
}
    class Childss extends A {
	
	public int A(int a) {
		System.out.println("Child class "+a);
		return a;
					
	}
	public void pqr() {
		System.out.println("Printing form calling parent class ");
	}

//    class extand extends A {
//	public int a1(){
//		int a=12; int b=43;
//		int c=a+b;
//		System.out.println("Extanded class : "+c);
//		return c;
//	}


         static void main(String args[]) {
    		Childss c=new Childss();
    		int r=c.A(12);
//    		extand ex=new extand();
//    		ex.a1();
    		
    		
    		A calling =new A();
    		calling.c();
    		
//    		A calling2 =new Child(); 
//    		calling2.pqr();
    		
    	}

    }