package daily_practice;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;

public class CollectionUtility {

	public static void main(String[] args) {
		List<String>flowers=Array.asList("Rose","Champa","Jashmin");
		
		Collection.sort(flowers);
		for(String flower:flowers)
			System.out.println(flower);

	}

}
