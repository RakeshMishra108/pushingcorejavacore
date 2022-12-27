package re_practice;

public class ProgramAssignment {
	
	private int ratePerPlate;
	private int plateCount;
	private int bill;
	private int discount;
	
	public ProgramAssignment() {
		
	}

	public ProgramAssignment(int ratePerPlate, int plateCount, int bill, int discount) {
		
		this.ratePerPlate = ratePerPlate;
		this.plateCount = plateCount;
		this.bill = bill;
		this.discount = (int) (bill - (bill*0.15));
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

	public int getBill() {
		bill=(plateCount*ratePerPlate);
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public int getDiscount() {
		this.discount = (int) (bill - (bill*0.15));
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
