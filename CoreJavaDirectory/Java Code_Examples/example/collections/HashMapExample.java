package example.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Float> restaurantRatings = new HashMap<String, Float>();
		restaurantRatings.put("McDonalds", 7.34f);
		restaurantRatings.put("KFC", 6.34f);
		restaurantRatings.put("Bawarchi", 9.34f);
		restaurantRatings.put("Kamat", 8.23f);
		
		//Obtaining a set of keys from this map
		Set<String> restaurantNames = restaurantRatings.keySet();
		//Traversing through this set and fetching the values one-by-one
		for(String restaurantName : restaurantNames) {
			//Passing a key: restaurantName to the get() method and retrieving a value: restaurantRating
			Float restaurantRating = restaurantRatings.get(restaurantName);
			System.out.println("Restaurant Name: " + restaurantName + ", Rating: " + restaurantRating);
		}
		
		System.out.println("------------------------------------");
		//Fetching values directly without keys
		Collection<Float> allRatings = restaurantRatings.values();
		for(Float rating : allRatings)
			System.out.println(rating);

	}

}





