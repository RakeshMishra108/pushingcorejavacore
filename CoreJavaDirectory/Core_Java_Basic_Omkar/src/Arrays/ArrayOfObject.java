package Arrays;

public class ArrayOfObject {
	private static void printMovie(Movies[] oldmovies) {
		for(Movies currentmovies:oldmovies) {
			System.out.println(currentmovies.getname()+" "+currentmovies.getyear());
		}
	}
	public static void main(String[] args) {
		int size = 3;
		Movies[] m = new Movies[size];
		m[0] = new Movies();
		m[1] = new Movies("Singham",2011);
		m[2] = new Movies("Black Water", 2007);
		
		//Another way
//		Movies m1 = new Movies("Singham",2011);
//		Movies m2 = new Movies("Black Water",2007);
//		Movies m3 = new Movies();
//		Movies[] movie = {m1,m2,m3};
		printMovie(m);
		
		
		
	}

}
