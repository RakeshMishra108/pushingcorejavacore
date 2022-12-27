package daily_practice;

import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Float> resturentRating = new HashMapingExample<String,Float>();
		resturentRating.put("Burger King", 59.26f);
		resturentRating.put(" King", 52.26f);
		resturentRating.put("Burger", 50.26f);
		
		//Obtsining Set of key
		Set<String>resturentNames=resturentRating.keySet();
		for(String resturentName : resturentName ) {
			FLoat resturentRating=resturentRating.get(resturentName);
			System.out.println("resturentName"+resturentName+"  --"+ resturentRating);
		}
		
		// fetching value Directly
		Collection<Float>allRatings=resturentRating.containsValue();
	 for(Float rating : allRating);
	 System.out.println(rating);
	
	}

}
