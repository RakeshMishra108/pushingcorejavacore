package assignment_rahul_sir_assignment1;

public class CatteringBillExample {

	public static void main(String[] args) {
		
		CatteringBill B1=new CatteringBill();
		B1.setRatePerPlate(234);
		B1.setPlateCount(45);
		
		
		System.out.println("rate per plate: --" +B1.getRatePerPlate());
		System.out.println("Bill without discount : --" +B1.getBill());
		System.out.println("With Discount: --" +B1.getDiscount());

	}

}
