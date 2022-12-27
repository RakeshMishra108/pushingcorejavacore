package com.Basics;
import java.util.Scanner;
public class Read {

	public static void main(String[] args) {
		int a;
		float a1;
		//short a3;
		//long a4;
		//double a5;
		//boolean a6;
		//byte a7;
		
		//Scanner method
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer : ");
		a = sc.nextInt();
		System.out.println("Enter the Float : ");
		a1 = sc.nextFloat();
		System.out.println("Enter the String : ");
		String a2 = sc.nextLine();
		//a3 = sc.nextShort();
		//a4 = sc.nextLong();
		//a5 = sc.nextDouble();
		//a6 = sc.nextBoolean();
		//a7 = sc.nextByte();
		
		System.out.println(a);
		
		System.out.println(a1);
		
		System.out.println(a2);
		//System.out.println(a3);
		//System.out.println(a4);
		//System.out.println(a5);
		//System.out.println(a6);
		//System.out.println(a7);
		sc.close();
		
	}

}
