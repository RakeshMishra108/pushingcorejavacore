package com.Basics;
import java.util.Scanner;
public class ModOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a, b;
		System.out.println("Enter the first number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println("Enter the second number : ");
		b = sc.nextFloat();
		System.out.println("Modulus of "+a+" and "+b+" is : "+ (a % b));
		sc.close();
	}

}
