package com.Basics;
import java.util.Scanner;
public class Compoundinterest {

	public static void main(String[] args) {
		double principle, rate, time, compound_interest;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle : ");
		principle = sc.nextDouble();
		System.out.println("Enter the rate without % : ");
		rate = sc.nextDouble();
		System.out.println("Enter the time : ");
		time = sc.nextDouble();
		compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
		System.out.println("Compound interest is : " + compound_interest);
		sc.close();
	}

}
