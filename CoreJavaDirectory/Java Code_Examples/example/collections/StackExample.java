package example.collections;

import java.util.Stack;

import example.io.Book;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating a Stack
		Stack values = new Stack();
		//Adding some values into this Stack
		values.add("Hello");//Adding a String
		values.add(100);//Adding an Integer: Autoboxing: values.add(new Integer(100));
		values.add(34.56);//Adding a Double
		values.add(new Book("Java Complete Reference", 860));//Adding a Book object
		
		//Iterating over this collection using a for-each loop
		//for(Object val : values)
			//System.out.println(val);
		
		int size = values.size();
		System.out.println("Size: " + size);
		
		//Popping an object
		Object poppedObject = values.pop();
		System.out.println("Popped object is " + poppedObject);
		size = values.size();
		System.out.println("Size: " + size);
		
		//Peeking an object
		Object peekedObject = values.peek();
		System.out.println("Peeked object is " + peekedObject);
		size = values.size();
		System.out.println("Size: " + size);

	}

}










