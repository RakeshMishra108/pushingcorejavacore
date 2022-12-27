package daily_practice;

import java.util.ShortedSet;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(Sting []args) {
		
		/*
		 * * not typeSafe So accept any type of any collection but through exception.
		ShortedSet laptopBrand=new Treeset();
		
		laptopBrand.add("Lenevo");
		laptopBrand.add("Apple");
		laptopBrand.add("Tosiba");
		laptopBrand.add("Dell");
		laptopBrand.add(100);
		
		for(Object brand:laptopbrands)
			System.out.println(brand);
			*/
		
        ShortedSet<String> laptopBrand=new TreeSet<String>();
		
		laptopBrand.add("Lenevo");
		laptopBrand.add("Apple");
		laptopBrand.add("Tosiba");
		laptopBrand.add("Dell");
		
		for(String brand:laptopBrand) {
			System.out.println(brand);
		}
				
		
	}

}







