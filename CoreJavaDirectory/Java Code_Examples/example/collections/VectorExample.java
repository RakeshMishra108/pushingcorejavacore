package example.collections;

import java.util.Vector;

import example.io.Book;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector values = new Vector();//The default capacity is 10
		values.add("Hello");//Adding a String
		values.add(100);//Adding an Integer: Autoboxing: values.add(new Integer(100));
		values.add(34.56);//Adding a Double
		values.add(new Book("Java Complete Reference", 860));//Adding a Book object
		
		int size = values.size();
		System.out.println("Size = " + size);
		int capacity = values.capacity();
		System.out.println("Capacity = " + capacity);
		
		//Adding 7 objects more so that the size will exceed capacity
		for(int a=1;a<=7;a++)
			values.add(a);
		
		size = values.size();
		System.out.println("New Size = " + size);
		capacity = values.capacity();
		System.out.println("New Capacity = " + capacity);
		
		
	}

}





