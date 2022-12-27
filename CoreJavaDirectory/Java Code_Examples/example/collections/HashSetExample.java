package example.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Creating a Set using String object
		/*Set<String> cities = new HashSet<String>();
		cities.add("Mumbai");
		cities.add("Pune");
		cities.add("Lucknow");
		cities.add("Nashik");
		cities.add("Jaipur");
		
		for(String city : cities)
			System.out.println(city);*/
		
		//Creating a Set using City objects
		City mumbai = new City();
		City pune = new City("Pune", "City of Peshwas");
		City jaipur = new City("Jaipur", "Pink City");
		City lucknow = new City("Lucknow", "City of Nawabs");
		City bengaluru = new City("Bengaluru", "City of IT");
		
		Set<City> cities = new HashSet<City>();
		cities.add(pune);
		cities.add(mumbai);
		cities.add(jaipur);
		cities.add(lucknow);
		cities.add(bengaluru);
		
		//Adding the cities Pune and Lucknow again
		cities.add(new City("Pune", "City of Peshwas"));
		cities.add(new City("Lucknow", "City of Nawabs"));
		
		for(City ct : cities)
			System.out.println(ct);
		

	}

}







