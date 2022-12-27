package example.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionUtilities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> flowers = Arrays.asList("Rose", "Lotus", "Sunflower", "Jasmine", "Lilly");
		 
		 Collections.sort(flowers);
		 for(String flower : flowers)
			 System.out.println(flower);

	}

}
