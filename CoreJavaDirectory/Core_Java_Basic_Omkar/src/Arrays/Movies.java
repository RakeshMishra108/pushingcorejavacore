package Arrays;

public class Movies {
	private String name;
	private int year;
	public Movies() {
		name = "noname";
		year = 2001;
	}
	public Movies(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	
	public String getname() {
		return name;
	}
	public int getyear() {
		return year;	
	}
}
