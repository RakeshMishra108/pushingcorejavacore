package com.Basics;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		int a, b, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		a = sc.nextInt();
		System.out.println("Enter the value of b : ");
		b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swap without 3rd variable --> a : "+a+"  b : "+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("Swap with 3rd variable --> a : "+a+"  b : "+b);
		sc.close();
	}

}
