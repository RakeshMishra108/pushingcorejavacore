package example.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithLaptopExample {

	public static void main(String[] args) {
		// Creating some Laptop Objects
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop("S02", "Lenovo", 43000);
		Laptop laptop3 = new Laptop("S03", "Dell", 45000);
		Laptop laptop4 = new Laptop("S04", "Toshiba", 44000);
		Laptop laptop5 = new Laptop("S05", "Apple", 104000);
		
		//Adding all the Laptop objects into a TreeSet
		SortedSet<Laptop> allLaptops = new TreeSet<Laptop>();
		allLaptops.add(laptop1);
		allLaptops.add(laptop2);
		allLaptops.add(laptop3);
		allLaptops.add(laptop4);
		allLaptops.add(laptop5);
		
		//Displaying all the available laptops
		for(Laptop laptop : allLaptops)
			System.out.println(laptop);
		
		
	}

}
