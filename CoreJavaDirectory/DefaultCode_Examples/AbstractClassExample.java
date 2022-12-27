
public class AbstractClassExample {

	public static void main(String[] args) {
		Shape sh =new Rectangle("First Shape", 10, 5);
		sh.draw();
		float area1 = sh.findArea();
		
		sh = new Circle("Second Shape", 15);
		sh.draw();
		float area2 = sh.findArea();
		
		System.out.println("Area of rectangle: " + area1);
		System.out.println("Area of circle: " + area2);

	}

}
