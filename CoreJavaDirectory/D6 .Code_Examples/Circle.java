
public class Circle extends Shape {
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(String title, int radius) {
		super(title);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the shape " + getTitle() + " with radius " + radius);

	}

	@Override
	public float findArea() {
		// TODO Auto-generated method stub
		float area = 3.14f * radius * radius;
		return area;
	}

}
