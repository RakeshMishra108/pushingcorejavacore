package com.Basics;
import java.util.Scanner;
public class FactorialRecursion {
	 static int fact(int a) {
		if(a == 0)
			return 1;
		else
			return(a * fact(a - 1));
	}
	public static void main(String[] args) {
		int num, ans;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		num = sc.nextInt();
		ans = fact(num);
		System.out.println("Factorial of "+num+" is "+ans);
		sc.close();
	}

}
