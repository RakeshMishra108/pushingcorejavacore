package example.collections;

import java.util.ArrayList;
import java.util.List;

public class TypeSafeCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The collection named as 'riverNames' must accept only String objects
		//To achieve this, declare the collection as type-safe for String type
		List<String> riverNames = new ArrayList<>();
		riverNames.add("Ganga");
		riverNames.add("Yamuna");
		riverNames.add("Godavari");
		riverNames.add("Krishna");
		riverNames.add("Koyna");
		
		//Trying to add an object other than String; but this won't compile
		//riverNames.add(200);
		for(String riverName : riverNames) {
			System.out.println(riverName.toUpperCase());
		}
		

	}

}




