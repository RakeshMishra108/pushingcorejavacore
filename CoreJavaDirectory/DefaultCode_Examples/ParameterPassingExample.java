
public class ParameterPassingExample {
	
	private static void changeMovie(Movie oldMovie) {
		oldMovie.setTitle("Singham Returns");
		oldMovie.setYear(2014);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie = new Movie("Singham", "Action", 2011, 2.76f);
		System.out.println("Before change: " + movie.getTitle() + ", " + movie.getYear());
		
		changeMovie(movie);
		
		System.out.println("After change: " + movie.getTitle() + ", " + movie.getYear());
		
	
		

	}

}
