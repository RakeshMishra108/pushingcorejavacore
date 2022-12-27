package example.collections;

import java.util.Comparator;

public class LaptopSerialNoAscendingComparator implements Comparator<Laptop>{
	//This class provides a sorting algorithm to sort Laptop objects on the basis of price in ascending order
	@Override
	public int compare(Laptop l1, Laptop l2) {
		// TODO Auto-generated method stub
		String firstSerialNo = l1.getSerialNo();
		String secondSerialNo = l2.getSerialNo();
		int comparison = firstSerialNo.compareTo(secondSerialNo);
		if(comparison == 0)
			comparison = 1;
		return comparison;
	}
	

}
