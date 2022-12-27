
public class Movie {
	private String title;//Instance Variable
	private String genre;
	private int year;
	private float length; //In hours
	
	
	public Movie() { //This is a no-argument constructor
		//Initializing the fields
				this.title = "Life of Pi";
				genre = "Emotional";
				year = 2012;
				length = 2.54f;
	}
	
	public void changeTitle(String title) {//Local Variable
		this.title = title;
	}
	
	public Movie(String title, String genre, int year, float length) {//This is a parameterized constructor
		this.title = title;
		this.genre = genre;
		this.year = year;
		this.length = length;
	}

	public Movie(String genre, int year, float length, String title) {
		this.genre = genre;
		this.year = year;
		this.length = length;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	

}
