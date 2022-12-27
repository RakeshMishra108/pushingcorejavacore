
public class ArrayDemo {
	private static Movie allMovies[];
	
	static {
		Movie m1 = new Movie("A","Horror", 2017, 1.5f);
		Movie m2 = new Movie("B","Thriller", 2014, 1.8f);
		Movie m3 = new Movie("C","Horror", 2012, 1.9f);
		allMovies = new Movie[]{m1, m2, m3};
	}

//	public static void main(String[] args) {
//		showAllHorrorMovieNames(allMovies);
//
//	}

//	private static void showAllHorrorMovieNames(Movie[] movieCollection) {
//		// TODO Auto-generated method stub
//		for(Movie movie : movieCollection) {
//			String genre = movie.getGenre();
//			if(genre.equals("Horror")) {
//				String title = movie.getTitle();
//				System.out.println(title);
//			}
//		}
		
//	}
//   static void main(String[] args) {
//	   showAllHorrorMovieNames(allMovies);	
//	}
	
	public static void main(String[] args) {
		showAllMovieNamesReleasedBefore2015(allMovies);
	}	
	
	private static void showAllMovieNamesReleasedBefore2015(Movie[] movieCollection) {
		for(Movie movie : movieCollection) {
//			String genre = movie.getGenre();
			int year = movie.getYear();
			if(year<=2015) {
				String genre = movie.getGenre();
				String title = movie.getTitle();
				System.out.println(title);
				System.out.println(genre);
				
			}
	}
	}
}
