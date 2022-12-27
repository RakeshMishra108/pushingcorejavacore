
public class MovieExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie();
		System.out.println("Current Title: " + movie1.getTitle());
		movie1.changeTitle("Bahubali");
		System.out.println("New Title: " + movie1.getTitle());
		
		/*
		 * Movie movie2 = new Movie("Singham", "Action", 2011, 2.76f); Movie movie3 =
		 * new Movie("Thriller", 2007, 1.56f, "Black Water");
		 */
		
		//movie1.setTitle("Life of PI");
		//movie1.setGenre("Emotional");
		//movie1.setYear(2012);
		//movie1.setLength(2.54f);
		
		//Printing some values
		/*
		 * System.out.println("Movie Name: " + movie3.getTitle());
		 * System.out.println("Year of Release: " + movie3.getYear());
		 * System.out.println("Duration (Hrs): " + movie3.getLength());
		 */
	}

}
