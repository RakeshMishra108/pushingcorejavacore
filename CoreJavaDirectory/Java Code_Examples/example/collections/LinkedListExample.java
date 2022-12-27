package example.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList values = new LinkedList();
		values.add("Hi");
		values.add(200);
		values.add(true);
		values.add(200);
		//Adding the element at the top
		values.addFirst("Welcome");
		
		for(Object val : values)
			System.out.println(val);
		
		//Retrieving the element from the bottom:
		Object elementAtBottom = values.getLast();
		System.out.println("Last element is " + elementAtBottom);

	}

}
