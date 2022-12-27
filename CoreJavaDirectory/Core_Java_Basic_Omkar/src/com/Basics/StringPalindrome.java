package com.Basics;
import java.util.Scanner;
public class StringPalindrome {

	static void palindrome(String str) {
		int i;
		String reverse = "";
		for(i=str.length()-1;i>=0;--i) {
			reverse = reverse + str.charAt(i);
		}
		if(str.equalsIgnoreCase(reverse))
		{
			System.out.println(str+" is Palindrome");
		}
		else
			System.out.println(str+" is not Palindrome");
	}
	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		S = sc.nextLine();
		palindrome(S);
		sc.close();
		
	}
}