package practice_exam;

import java.util.Scanner;

public class Condition_ElseIf {

	public static void main(String[] args) {
		int Marks;
		System.out.println("Enter otained Marks: ");
		Scanner r=new Scanner(System.in);
		Marks=r.nextInt();

		if(Marks>=60 && Marks<=100) {
			System.out.println("Bahut Badhiya");
		}
		else if(Marks>=40 && Marks<60) {
			System.out.println("Sahi Chal raha hi");
		}
		else if(Marks>=35 && Marks<40) {
			System.out.println("Upar waleki daya hi");
		}
		else
			System.out.println("Prepairing for Engineering KT");
	}

}
