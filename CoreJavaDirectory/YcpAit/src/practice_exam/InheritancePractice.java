package practice_exam;

public class InheritancePractice {
//
//	public InheritancePractice() {
//		
//	}
    void c(){
    	System.out.println("Parent Class method --c");
    }	
}

class B extends InheritancePractice{
	 int d() {
		 int k=10;
		System.out.println("Child class B method d"+k);
		return k;
	}
}



 class X{
	public static void main(String args[]) {
		B r=new B();
		InheritancePractice l =new InheritancePractice();
		r.d();
		l.c();
		
	}
}