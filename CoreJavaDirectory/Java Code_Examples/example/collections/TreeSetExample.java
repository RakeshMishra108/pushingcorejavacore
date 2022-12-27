package example.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		/*
		 * The following collection is not type safe; so can accept any type of object.
		 * But throws an exception because it is sorted collection
		SortedSet laptopBrands = new TreeSet();
		laptopBrands.add("HP");
		laptopBrands.add("Dell");
		laptopBrands.add("Toshiba");
		laptopBrands.add("Lenovo");
		laptopBrands.add("Apple");
		laptopBrands.add(100);
		
		for(Object brand : laptopBrands)
			System.out.println(brand);
		*/
		SortedSet<String> laptopBrands = new TreeSet<String>();
		laptopBrands.add("HP");
		laptopBrands.add("Dell");
		laptopBrands.add("Toshiba");
		laptopBrands.add("Lenovo");
		laptopBrands.add("Apple");
		
		for(String brand : laptopBrands) {
			System.out.println(brand);
		}
	}

}
