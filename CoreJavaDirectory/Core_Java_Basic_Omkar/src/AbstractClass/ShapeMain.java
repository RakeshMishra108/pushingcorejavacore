package AbstractClass;

public class ShapeMain {

	public static void main(String[] args) {
		//Shape sh = new Shape();//can't create object of abstract class
		Shape sh = new Rectangle("First Shape",10,5);
		sh.draw();
		float area1 = sh.findArea();
		
		sh = new Circle("Second Shape ",15);
		sh.draw();
		float area2 = sh.findArea();
		System.out.println("Area of Rectangle : "+area1);
		System.out.println("Area of Circle : "+area2);
	}

}
