package assignment_rahul_sir_assignment1;

// class
public class CatteringBill {
	
	// variables
	private int ratePerPlate;
	private int plateCount;
	private int bill;
	private int discount;
	 
	// Getter & Setters
	public int getDiscount() {                         //Method Calling
	    this.bill= (int) (bill - (bill*0.15));
		int finalBill=(int) bill;
		return finalBill;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	
	public int getBill() {
		bill=ratePerPlate*plateCount;
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	int generateBill() {
		return generateBill();
	}

	public int getRatePerPlate() {
		return ratePerPlate;
	}

	public void setRatePerPlate(int ratePerPlate) {
		this.ratePerPlate = ratePerPlate;
	}

	public int getPlateCount() {
		return plateCount;
	}

	public void setPlateCount(int plateCount) {
		this.plateCount = plateCount;
	}


	
}
