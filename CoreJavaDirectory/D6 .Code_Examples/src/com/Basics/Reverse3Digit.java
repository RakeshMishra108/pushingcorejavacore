package com.Basics;
import java.util.Scanner;
public class Reverse3Digit {

	public static void main(String[] args) {
		int i, num, reverse, sum=0;
		System.out.println("Enter 3 Digit Number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for(i=num;i>0;i=i/10)
		{
			reverse = i % 10;
			sum = sum * 10 + reverse;
			
		}
		System.out.println("Reverse : "+sum);
	}

}
