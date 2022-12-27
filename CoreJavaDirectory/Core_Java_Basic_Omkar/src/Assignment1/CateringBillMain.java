package Assignment1;
import java.util.Scanner;
public class CateringBillMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int discount =0;
		CateringBill B = new CateringBill();
		B.setPlateCount();
		B.setRatePerPlate();
		System.out.println("Discount : ");
		discount = sc.nextInt();
		System.out.println("Total Bill without discount : "+B.generateBill());
		System.out.println("Total Bill with discount : "+B.generateBill(discount));
		
	}

}
