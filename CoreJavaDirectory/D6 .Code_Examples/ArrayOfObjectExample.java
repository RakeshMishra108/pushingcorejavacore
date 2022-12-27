
public class ArrayOfObjectExample {
	
	private static void printAllMovieNames(Movie[] movieCollection) {
		for(Movie currentMovie : movieCollection)
			System.out.println(currentMovie.getTitle() + ", " + currentMovie.getGenre());
	}

	public static void main(String[] args) {
		Movie[] movies = new Movie[3];
		movies[0] = new Movie();
		movies[1] = new Movie("Singham", "Action", 2011, 2.76f); 
		movies[2] = new Movie("Thriller", 2007, 1.56f, "Black Water");
		
		printAllMovieNames(movies);
		
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		Movie anotherMovies[] = {m1, m2, m3};

	}

}
