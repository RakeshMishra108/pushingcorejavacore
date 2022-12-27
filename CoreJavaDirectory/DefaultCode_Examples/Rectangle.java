
public final class Rectangle extends Shape {
	private int length, breadth;
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String title, int length, int breadth) {
		super(title);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Drawing the shape " + getTitle() + " with length " + length + " and breadth " + breadth);
		
	}

	@Override
	public float findArea() {
		// TODO Auto-generated method stub
		float area = length * breadth;
		return area;
	}
	//@Override
	/*public String getTitle() { //Cannot override because the method is declared as 'final'
		return "....";
	}*/

}

//class MyRectangle extends Rectangle { } Cannot create a subclass because Rectangle is a 'final' class 
