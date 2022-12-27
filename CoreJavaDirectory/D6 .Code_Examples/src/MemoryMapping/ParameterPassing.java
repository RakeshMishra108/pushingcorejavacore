package MemoryMapping;

public class ParameterPassing {
	static void change(int y) {//  y = 10
		y++;// y = 11
	}
	//primitives are always passed by values where as objects are passed by reference
	public static void main(String[] args) {
		int x = 10;
		change(x);
		System.out.println("x : "+x);// x = 10
	}

}
