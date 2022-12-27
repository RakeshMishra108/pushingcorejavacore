package example.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList values = new ArrayList();
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(45.76f);
		
		//Populating an Iterator on the top of the ArrayList named as 'values'
		Iterator it = values.iterator();
		//Iterating over the collection
		while(it.hasNext()) {
			Object value = it.next();
			System.out.println(value);
		}	
		System.out.println("--------------");
		//Removing a value 200
		it = values.iterator();
		//Iterating over the collection and if the value is 200, remove that
		while(it.hasNext()) {
			Object value = it.next();
			if(value.equals(200))
				it.remove();
		}	
		System.out.println("Size = " + values.size());

	}

}





