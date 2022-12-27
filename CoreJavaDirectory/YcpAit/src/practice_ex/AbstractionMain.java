package practice_ex;

public class AbstractionMain {

	public static void main(String[] args) {
		System.out.println("Property of Animal Class are as follows For Cow and Dog \n");


		AbstractionExtends2 r1=new AbstractionExtends2();
		r1.sound();
		r1.eat();
		r1.legs();

		AbstractionExtends3 r=new AbstractionExtends3();
		r.eat();
		r.sound();
		AbstractionClass1.legs();


	}

}
