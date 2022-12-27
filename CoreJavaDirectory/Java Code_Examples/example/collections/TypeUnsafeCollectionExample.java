package example.collections;

import java.util.ArrayList;

public class TypeUnsafeCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList riverNames = new ArrayList();
		riverNames.add("Ganga");
		riverNames.add("Yamuna");
		riverNames.add("Godavari");
		riverNames.add("Krishna");
		riverNames.add("Koyna");
		riverNames.add("Raavi");
		riverNames.add(100);
		
		//Printing river names in UPPERCASE
		for(Object obj : riverNames) {
			String riverName = (String)obj;
			System.out.println(riverName.toUpperCase());
		}

	}

}




