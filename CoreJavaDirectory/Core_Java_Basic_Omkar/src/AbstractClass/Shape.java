package AbstractClass;

public abstract class Shape {//abstract class may have abstract methods//Used to declare methods
	//abstract class may contain concrete methods -->defined methods 
	private String title;
	//constructors
	public Shape() {

	}
	public Shape(String title) {
		this.title = title;
	}
	//abstract methods//only non static methods can be abstract
	abstract public void draw();//should be defined throughout the inheritance
	abstract public float findArea();//should be defined throughout the inheritance
	
	//Getters and setters//can be said concrete methods 
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
