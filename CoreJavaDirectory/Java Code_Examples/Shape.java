
 abstract public class Shape {
	 private String title;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	public Shape(String title) {
		this.title = title;
	}
	
	public final String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public abstract void draw();
	public abstract float findArea();

}
