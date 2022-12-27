package com.Basics;
import java.util.Scanner;
public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c;
		System.out.println("Enter the first number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		System.out.println("Enter the second number : ");
		b = sc.nextFloat();
		System.out.println("Enter the third number : ");
		c = sc.nextFloat();
		if(a >= b && a >= c) {
			System.out.println(a+" is Greatest");
		}
		else if(b >= a && b >= c){
				System.out.println(b+" is Greatast");
			}
		else
		{
			System.out.println(c+" is Greatest");
		}
		sc.close();
	}

}
