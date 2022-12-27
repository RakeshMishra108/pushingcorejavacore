package example.inner_classes;

public class InnerClassExample {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.StaticInner os = new Outer.StaticInner();//Creating an object of Static Inner class
		//Outer.Nested on = o.new Nested();
		Outer.Nested on = new Outer().new Nested();//Creating an object of Nested class
		
		os.print();
		on.print();
		o.print();

	}

}
