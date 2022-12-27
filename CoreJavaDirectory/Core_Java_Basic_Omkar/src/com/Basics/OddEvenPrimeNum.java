package com.Basics;
import java.util.Scanner;
public class OddEvenPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, i, b, count;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		sc.close();
		System.out.println("Even Number : ");
		for(i=1;i<=a;i++) {
			if(i % 2 == 0)
			{
				System.out.print(i+" ");
			}
			else
				continue;
		}
		System.out.println("");
		System.out.println("Odd Number : ");
		for(i=1;i<=a;i++) {
			if(i % 2 == 1)
			{
				System.out.print(i+" ");
			}
			else
				continue;
		}
		System.out.println("");
		System.out.println("");
		System.out.println("Prime Number : ");
		for(i=1;i<=a;i++) {
			count = 0;
			for(b=i;b>=1;b--)
			{
				if(i % b == 0)
					count = count + 1;
			}
			if(count == 2)
			{
				System.out.print(i+" ");
			}
		}
	}
}