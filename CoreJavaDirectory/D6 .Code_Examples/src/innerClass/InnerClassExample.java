package innerClass;

public class InnerClassExample {

	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.StaticInner os = new Outer.StaticInner();
		
		Outer.Nested on = new Outer().new Nested();
		
		os.print();
		o.print();
		on.print();
	}

}
