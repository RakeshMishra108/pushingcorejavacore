package com.Basics;
import java.util.Scanner;
public class AreaRectangle {

	public static void main(String[] args) {
		float length, breadth, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle : ");
		length = sc.nextFloat();
		System.out.println("Enter the breath of Rectangle : ");
		breadth = sc.nextFloat();
		area = length * breadth;
		System.out.println("Area of Rectangle is : "+area);
		sc.close();
	}

}
