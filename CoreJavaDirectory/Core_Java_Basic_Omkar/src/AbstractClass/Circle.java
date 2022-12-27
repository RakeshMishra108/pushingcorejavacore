package AbstractClass;

public class Circle extends Shape {
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(String title) {
		super(title);
	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle(String title, int radius) {
		super(title);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the Shape "+getTitle()+" with radius "+radius);
	}

	@Override
	public float findArea() {
		float area = 3.14f * radius * radius;
		return area;
	}

}
