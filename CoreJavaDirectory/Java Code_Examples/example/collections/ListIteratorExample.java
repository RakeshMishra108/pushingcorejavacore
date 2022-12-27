package example.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList values = new ArrayList();
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(45.76f);
		
		//Populating a ListIterator on the top of the ArrayList: 'values' 
		//in such a way the the cursor points to the bottom
		
		int size = values.size();
		ListIterator listIt = values.listIterator(size);
		while(listIt.hasPrevious()) {
			Object value = listIt.previous();
			System.out.println(value);
		}
		

	}

}





