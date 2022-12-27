package com.Basics;
import java.util.Scanner;
public class ASCIIvalue {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		ch = sc.next().charAt(0);
		int c = ch;
		System.out.println("the ASCII value of "+ch+" is : "+c);
		sc.close();
	}

}
