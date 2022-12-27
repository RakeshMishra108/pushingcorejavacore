package com.Basics;
import java.math.BigInteger;
import java.util.Scanner;
public class MathClassBigInteger {

	public static void main(String[] args) {
		String a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers : ");
		a = sc.nextLine();
		b = sc.nextLine();
		BigInteger big1 = new BigInteger(a);
		BigInteger big2 = new BigInteger(b);
		BigInteger max = big1.max(big2);
		System.out.println("Maxminum number is : "+(max));
		sc.close();
	}

}
