package Assignment1;
import java.util.Scanner;
public class CateringBill {
	private int plateCount;
	private int ratePerPlate;
	Scanner sc = new Scanner(System.in);
	public int getPlateCount() {
		return plateCount;
	}
	public void setPlateCount() {
		System.out.println("Enter the number of Plates : ");
		plateCount = sc.nextInt();
	}
	public int getRatePerPlate() {
		return ratePerPlate;
	}
	public void setRatePerPlate() {
		System.out.println("Rate per Plate : ");
		ratePerPlate = sc.nextInt();
	}
	public float generateBill() {
		float Bill = plateCount * ratePerPlate;
		return Bill;
	}
	public float generateBill(int discountPercent) {
		float Bill = plateCount *ratePerPlate;
		Bill = Bill - (Bill*discountPercent/100);
		return Bill;
	}
	
}
