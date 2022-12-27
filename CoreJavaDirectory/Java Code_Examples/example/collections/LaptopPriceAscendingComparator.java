package example.collections;

import java.util.Comparator;

public class LaptopPriceAscendingComparator implements Comparator<Laptop>{
	//This class provides a sorting algorithm to sort Laptop objects on the basis of price in ascending order
	@Override
	public int compare(Laptop l1, Laptop l2) {
		// TODO Auto-generated method stub
		Integer price1 = l1.getPrice();
		Integer price2 = l2.getPrice();
		int comparison = price1.compareTo(price2);
		if(comparison == 0)
			comparison = 1;
		return comparison;
	}
	

}
