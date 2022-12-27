package practice_exam;

public class Ab {
      void q() {
    	  int num1=23; int num=32;
    	  int resultant=num1+num;
    	  System.out.println(resultant);
    	  
      }
}

class C extends Ab{
	int num12=34;
	  static void p(){
		System.out.println("Enter the value"); 
	}
	   void s(){
			System.out.println("Enter the value"+num12); 
		}
}

class D{
	public static void main(String args[]) {
//	C re=new C();
//	C.p();
	Ab rr=new Ab();
	rr.q();
	}
	
}
