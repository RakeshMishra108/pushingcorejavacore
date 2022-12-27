package com.Basics;
import java.util.Scanner;
public class Student {
	private int rollno;	//For data integrity
	private String name; //For data integrity
	Scanner sc = new Scanner(System.in);
	public Student() {//Constructor
		rollno = 00;
		name = "Noname";
	}
	public void set_rollno() {//Set roll no method, Fill the data
		System.out.println("Enter the Roll number : ");
		rollno = sc.nextInt();
	}
	public void set_name() {//Set Name method, Fill the data
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
	}
	public int get_rollno() {//Get roll no method, retrive data
		return rollno;
	}
	public String get_name() {//Get name method, retrive data
		return name;
	}
}
