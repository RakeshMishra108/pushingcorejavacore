package example.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList values = new ArrayList();
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(200);
		
		for(Object val : values)
			System.out.println(val);

	}

}
