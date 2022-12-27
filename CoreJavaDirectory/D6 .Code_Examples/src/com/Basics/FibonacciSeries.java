package com.Basics;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0, b=1, n, i, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for Fibonacci Series : ");
		n = sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			c = a + b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		
	}

}
