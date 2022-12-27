package AbstractClass;

public class Rectangle extends Shape{
	private int length, breadth;
	public Rectangle() {

	}

	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public Rectangle(String title, int length, int breadth) {
		super(title);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the Shape "+getTitle()+" with length "+length+" and breadth "+breadth);
	}

	@Override
	public float findArea() {
		float area = length * breadth;
		return area;
	}

}
