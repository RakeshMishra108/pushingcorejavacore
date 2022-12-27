package com.Basics;
import java.util.Scanner;
public class Powerofnumber {

	public static void main(String[] args) {
		int power = 1, base, exponent;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base : ");
		base = sc.nextInt();
		System.out.println("Enter the exponent : ");
		exponent = sc.nextInt();
		for(int i=1;i<=exponent;i++)
		{
			power = power * base; 
		}
		System.out.println("Power of "+base+"^"+exponent+" is : "+power );
		sc.close();
	}

}
