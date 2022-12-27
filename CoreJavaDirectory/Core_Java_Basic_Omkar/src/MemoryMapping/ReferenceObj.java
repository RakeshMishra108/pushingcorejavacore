package MemoryMapping;

public class ReferenceObj {
	String S = "my method";
	void method() {
		System.out.println("My method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferenceObj R1 = new ReferenceObj();//one object can have multiple reference 
		//but one reference can not point multiple object
		ReferenceObj R2 = R1;//references
		System.out.println("R1 obj value : "+R1.S);
		System.out.println("R2 obj value : "+R2.S);
	}

}
