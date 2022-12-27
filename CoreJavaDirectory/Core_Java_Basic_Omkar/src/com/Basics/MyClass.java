package com.Basics;

public class MyClass {//Static initialization Block //Get fire during .class file is loaded inside the class loader(jre)
	//static method initiates before main method
	static {
		System.out.println("Static method initiated");
	}
	public static void main(String[] args) {
		System.out.println("Main  method initiated");
	}
}
