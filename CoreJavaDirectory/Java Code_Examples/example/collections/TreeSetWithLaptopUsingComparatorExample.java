package example.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetWithLaptopUsingComparatorExample {

	public static void main(String[] args) {
		
		// Creating some Laptop Objects
		Laptop laptop1 = new Laptop();
		Laptop laptop2 = new Laptop("S02", "Lenovo", 43000);
		Laptop laptop3 = new Laptop("S03", "Dell", 45000);
		Laptop laptop4 = new Laptop("S04", "Toshiba", 44000);
		Laptop laptop5 = new Laptop("S05", "Apple", 104000);
		
		//To customize the sorting algorithm, it is necessary to obtain the relevant Comparator
		//Obtaining both the comparators which are available
		Comparator<Laptop> comp1 = new LaptopPriceAscendingComparator();
		Comparator<Laptop> comp2 = new LaptopSerialNoAscendingComparator();
		//Adding all the Laptop objects into a TreeSet
		//SortedSet<Laptop> allLaptops = new TreeSet<Laptop>(); //Uses default algorithm
		SortedSet<Laptop> allLaptops = new TreeSet<Laptop>(comp1);//Uses algorithm set by comp1
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
