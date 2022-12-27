package com.Basics;
import java.util.Scanner;

class Circle {
	float pie = 3.14f, r, area, circumference;
	public void area(float r) {
		area = pie * r * r;
		System.out.println("Area of Circle is : "+area);
	}
	public void circumference(float r) {
		circumference = 2 * pie * r;
		System.out.println("Cicumference of circle is : "+circumference);
	}
}
public class AreaCircumferenceCircle {

	public static void main(String[] args) {
			float r;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius of Circle : ");
			r = sc.nextFloat();
			Circle c = new Circle();
			c.area(r);
			c.circumference(r);
			sc.close();
	}

}
