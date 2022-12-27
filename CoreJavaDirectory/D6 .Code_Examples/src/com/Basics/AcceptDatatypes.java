package com.Basics;
import java.util.Scanner;
public class AcceptDatatypes {

	public static void main(String[] args) {
		int i;
		float f;
		long l;
		short s;
		double d;
		boolean b;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Integer ,Float, Long, Short, Double, Boolean, Character : ");
		i = sc.nextInt();
		f = sc.nextFloat();
		l = sc.nextLong();
		s = sc.nextShort();
		d = sc.nextDouble();
		b = sc.nextBoolean();
		ch = sc.next().charAt(0);
		System.out.println("Integer : "+i);
		System.out.println("Float : "+f);
		System.out.println("Long : "+l);
		System.out.println("Short : "+s);
		System.out.println("Double : "+d);
		System.out.println("Boolean : "+b);
		System.out.println("Character : "+ch);
		sc.close();

	}

}