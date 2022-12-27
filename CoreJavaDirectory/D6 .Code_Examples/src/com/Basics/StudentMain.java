package com.Basics;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Default values --> ");
		System.out.println("Name : "+s1.get_name());
		System.out.println("Roll no. : "+s1.get_rollno());
		s1.set_name();
		s1.set_rollno();
		System.out.println("Updated Record --> ");
		System.out.println("Name : "+s1.get_name());
		System.out.println("Roll no. : "+s1.get_rollno());
		
	}

}
