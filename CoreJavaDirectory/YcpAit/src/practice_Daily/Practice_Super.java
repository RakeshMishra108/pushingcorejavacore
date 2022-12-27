package practice_Daily;

public class Practice_Super {	
	public static void main(String[] args) {
		b r=new b();
		r.b();
	}
}


class a{
	 a(int c){
		System.out.println("Enter to Super Class having method name a."+c);
	}
}

class b extends a{
	 b() {
		super(100);
		System.out.println("Enter to Sub-Class having method name b.");
	}

	public void b() {
		
	}

	

}		
	

	


